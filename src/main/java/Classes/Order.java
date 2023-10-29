package Classes;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Order {
    private Customer customer;
    private Product product;
    private int quantity;



    @Override
    public String toString() {
        return "Заказ: " + customer.getName() +
                " купил " + quantity + " единиц(у) товара " +
                product.getName() + " по цене " + product.getPrice() + " каждая.";
    }
}