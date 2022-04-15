package org.launchcode.java;

import java.util.HashMap;
import java.util.Map;

public class Counting {
    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms" +
                " has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = testString.toCharArray();

        for (char character : charactersInString){
            if (count.containsKey(character)){
                count.put(character, count.get(character) + 1);
            } else {
                count.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: count.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        }
    }
//        int count = 0;
//        for (int i = 0; i < countingStuff.length(); i++) {
//            if (countingStuff.charAt(i) != ' ')
//                count++;
//        }
//            System.out.println("The number of characters is: " + count);
//              System.out.println(numberOfCharacters.get(i) + count);