package Classes;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Product {  private String name;
    private double price;


    @Override
    public String toString() {
        return "Товар: " + name + ", цена: " + price;
    }
}
