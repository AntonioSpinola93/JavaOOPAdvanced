package AdvancedJavaOOP._2;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        System.out.println("Esercizio 1");
        // 1a. Create a map of integers to strings
        Map<Integer, String> gameCollection = new HashMap<>();

        // 1b. Add 3 elements to the map .put
        gameCollection.put(1,"Monster Hunter World");
        gameCollection.put(2,"Sea of Thieves");
        gameCollection.put(3,"Hunt Showdown");
        gameCollection.put(4,"Darkest Dungeon");
        // 1c. Print the map
        System.out.println("My game collection : "+ gameCollection);
        // 1d. Access an element in the map with .get
        System.out.println("My actual favourite game is "+gameCollection.get(3));
        // 1e. Remove an element from the map .remove
        gameCollection.remove(4);
        // 1f. Print the map again to confirm the element was removed
        System.out.println(gameCollection);
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        System.out.println("Esercizio 2");
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);


        String mostExpensiveMenuItemName = null;
        double maxValue = Double.MIN_VALUE;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so
        for (Map.Entry<String,Double>entry:menuCostsInEuro.entrySet()){
            if (entry.getValue()>maxValue ){
                maxValue=entry.getValue();
                mostExpensiveMenuItemName = entry.getKey();
            }
        }
        System.out.println("the most expensive is : "+ mostExpensiveMenuItemName +" "+ maxValue);

        // Your code
        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        System.out.println("Esercizio 3");
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 10);
        int maxWeight = Integer.MIN_VALUE;

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight
        for (Map.Entry<String,Integer>theWeight:fruitWeights.entrySet()){
            totalWeight += theWeight.getValue();
            if (theWeight.getValue()>maxWeight){
                maxWeight=theWeight.getValue();
            }
        }
        System.out.println("the total weight is : "+ totalWeight);
            System.out.println("the heaviest is :" + maxWeight);

        // Your code

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
