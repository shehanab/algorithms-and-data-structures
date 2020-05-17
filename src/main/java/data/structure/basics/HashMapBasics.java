package data.structure.basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<Integer, String> temp = new HashMap<>();


        temp.put(1, "1");
        temp.put(2, "2");
        temp.put(3, "3");
        temp.put(4, "4");

        System.out.println(temp.size());
        System.out.println(temp.isEmpty());
        System.out.println(temp);
        System.out.println(temp.get(1));
        System.out.println(temp.entrySet());
        System.out.println(temp.keySet());

        tempMethod();


    }


    public static void tempMethod()
    {
        // Create a LinkedHashMap
        LinkedHashMap<String,Integer> m =
                new LinkedHashMap<String, Integer>();

        m.put("1 - Bedroom" , 25000);
        m.put("2 - Bedroom" , 50000);
        m.put("3 - Bedroom" , 75000);
        m.put("1 - Bedroom - hall", 65000);
        m.put("2 - Bedroom - hall", 85000);
        m.put("3 - Bedroom - hall", 105000);

        // Using entrySet() to get the entry's of the map
        Set<Map.Entry<String,Integer>> s = m.entrySet();

        for (Map.Entry<String, Integer> it: s)
        {
            // Using the getKey to get key of the it element
            // Using the getValue to get value of the it element
            System.out.println("Before channge of value = " +
                    it.getKey() + "   " +  it.getValue());

            // Changing the value of 1 - Bedroom.
            double getRandom = Math.random() * 100000;
            int getRoundoff = (int) Math.round(getRandom);

            // Using setValue to change the value of the
            // map element
            it.setValue(getRoundoff);

            System.out.println("After change of value = " +
                    it.getKey() + "   " + it.getValue());
        }
    }

}
