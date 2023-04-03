package AdvancedJavaOOP._3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String> soloList = new HashSet<>(list);
        list = new ArrayList<>(soloList);
        System.out.println(soloList);


        // Your code here

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        toSet(list);
        toSet(set);

        System.out.println(toSet(list));
        System.out.println(toSet(set));

    }

    // Write your method for exercise 2 here
    // creo un metodo per toSet =
    private static Set<String> toSet(Collection<String> collezione) {
        Set<String> set = new HashSet<>(collezione);
        return set;
    }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";

        List<String> words = Arrays.stream(str.split(" ")).toList();

        Map<String, Integer> wordCount = new HashMap<>();
        int counter=0;


        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.
        for (String singleWord:words ){
            wordCount.put(singleWord,counter);
        }
        System.out.println(wordCount);
        for (String singleWord:words ){
            for(Map.Entry<String,Integer>newList: wordCount.entrySet()){
                if(newList.getKey().equals(singleWord)){
                    newList.setValue(newList.getValue()+1);
                }

            }
        }
            System.out.println(wordCount);

    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: List perchè restituisce una lista ordinata di elementi indicizzati
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: Map perchè lo studente sarebbe la key e i suoi voti il value
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: List perchè possiamo costruire una lista in ordine di età
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Map per registrare il tipo di prodotto e il suo prezzo
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: List perchè avremo una lista indicizzata di impiegati e sarebbero ammessi anche omonimi
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: Map perchè usando come key il nome della città recuperiamo il dato della popolazione
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: Map
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: map
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: Map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: map
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: map
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: map
     */

}
