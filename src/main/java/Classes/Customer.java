package Classes;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Customer {

    private String name;
    private int age;


    @Override
    public String toString() {
        return "Покупатель: " + name + ", возраст: " + age;
    }
}

