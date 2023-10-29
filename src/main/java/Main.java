import Classes.Customer;
import Classes.Order;
import Classes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;


public class Main {
    public static void main(String[] args) {
        //   создаем массив покупателей, массив товаров и массив заказов;

        Customer  customer1 = new  Customer();
        Customer  customer2 = new  Customer();
        Customer  customer3 = new  Customer();
        customer1.setName("Джеймс") ;
        customer1.setAge(34);
        customer2.setName("Фекла") ;
        customer2.setAge(67);
        customer3.setName("Епифантий") ;
        customer3.setAge(28);

        Product  product1 = new  Product();
        Product  product2 = new  Product();
        Product  product3 = new  Product();
        product1.setName("Молоко") ;
        product1.setPrice(34.60) ;
        product2.setName("Хлеб") ;
        product2.setPrice(34.60) ;
        product3.setName("Мясо") ;
        product3.setPrice(124.56);

        Customer[] customers = { customer1 , customer2, customer3 };
        Product[] products = {product1, product2, product3};
        Order[] orders = new Order[3];

        // совершение покупок и заполнение массива заказов
        try {
            orders[0] = makePurchase(customers[0], products[0], 2);
            orders[1] = makePurchase(customers[1], products[1], 3);
            orders[2] = makePurchase(customers[2], products[2], 10); // выбросит исключение
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // вывод информации о заказах
        for (Order order : orders) {
            System.out.println(order.toString());
        }

        // вывод итогового количества совершенных покупок
        System.out.println("Итого совершено покупок: " + orders.length);
    }

    //  - создали статический метод “совершить покупку” со строковыми параметрами,
    //  соответствующими полям объекта заказа. Метод должен вернуть объект заказа
    public static Order makePurchase(Customer customer, Product product, int quantity) throws Exception {
        if (customer.getName() == null) {
            throw new Exception("Покупатель не найден!");
        }
        if (product.getName() == null || product.getPrice() == 0) {
            throw new Exception("Товар покупателя "+ customer.getName()+" -не найден!");
        }
        if (quantity <= 0) {
            throw new Exception("У пакупателя "+ customer.getName()+" - Некорректное количество товара !");
        }
        return new Order(customer, product, quantity);
    }
}