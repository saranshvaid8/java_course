package chapter9;

import java.util.*;

/**
 * Contains different data structures from the collection framework
 */
public class CollectionFw {
    public static void main(String[] args) {

        Set defaultSet = new HashSet();
        defaultSet.add("Apple");
        defaultSet.add(1);
        defaultSet.add(5);
        defaultSet.add("Banana");

        List<String> fruits = new ArrayList();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Avocado");
        fruits.add("Kiwi");

        Map fruitPrice = new HashMap();
        fruitPrice.put("Apple", 8);
        fruitPrice.put("Banana",6);
        fruitPrice.put("Kiwi",5);

        printCollectionSet(defaultSet);
        printListOfStrings(fruits);
        printKeyValue(fruitPrice);

    }

    private static void printKeyValue(Map fruitPrice) {
        System.out.println("fruits and their cost = " + fruitPrice);
        System.out.println(fruitPrice.remove("Banana",6));
        fruitPrice.forEach((k,v) ->  System.out.println(String.format("built-in foreach: key = %s | value = %s",k,v)));

        for (var entry: fruitPrice.entrySet()){
            System.out.println("Printing using forEach "+ entry);
        }

    }

    private static void printListOfStrings(List<String> stringList) {
        System.out.println("List of fruits contain " + stringList);
        var iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println("Printing using list iterator " + iterator.next());
        }

    }

    private static void printCollectionSet(Set defaultSet) {
        System.out.println("defaultSet contains " + defaultSet);
         defaultSet.forEach(System.out::println);


    }
}
