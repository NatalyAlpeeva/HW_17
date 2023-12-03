package collections.eight;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class WithoutDuplicates {
        public static <T> Collection<T> withoutDuplicates(Collection<T> collection) {
        HashSet<T> setWithoutDuplicates = new HashSet<>(collection);
        return setWithoutDuplicates;
    }

        public static void main(String[] args) {

        Collection<String> stringCollection = List.of("cat", "dog", "bear", "mouse", "bear", "cat");
        Collection<String> setWithoutDuplicates = withoutDuplicates(stringCollection);

        System.out.println("Collection " + stringCollection);
        System.out.println("Collection without duplicates " + setWithoutDuplicates);
    }
}
