package collections.seven;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> map = new HashMap<>();
        map.put("Kesha", new Carrot("Kesha"));
        map.put("Baksik", new Cat("Baksik"));
        map.put("Sharik", new Dog("Sharik"));

        printKeys(map);
        }

    private static void printKeys(Map< String, Pet> map){
        System.out.println("Keys of Map:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
