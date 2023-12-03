package collections.six;

import java.util.HashMap;
import java.util.Map;

public class Toy {
    private String name;
    private double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();

        Toy barbie = new Toy("barbie", 400);
        Toy ken = new Toy("ken", 450);
        Toy unicorn = new Toy("unicorn", 500);

        toyMap.put("barbie", barbie);
        toyMap.put("ken", ken);
        toyMap.put("unicorn", unicorn);
        //entrySet
        for (Map.Entry<String, Toy> entry : toyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("==========");
        //keySet
        for (String name : toyMap.keySet()) {
            System.out.println(name);
        }
        System.out.println("==========");
        //values
        for (Map.Entry<String, Toy> pair : toyMap.entrySet()) {
            String key = pair.getKey(); //key
            Toy value = pair.getValue(); //value
            System.out.println(key + ":" + value);

        }
    }
}
