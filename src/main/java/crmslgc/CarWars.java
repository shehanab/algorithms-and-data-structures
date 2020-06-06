package crmslgc;

import java.util.HashMap;
import java.util.Map;

public class CarWars {

    public static void main(String[] args) {
        System.out.println(alecsWins("A586QK", "JJ653K"));


    }

    private static int alecsWins(String alec, String bob) {

        if (alec.length() != bob.length()) {
            return -1;
        }

        Map<String, Integer> scores = getScores();

        char[] alecs = alec.toCharArray();
        char[] bobs = bob.toCharArray();

        int countAlecsWins = 0;

        for (int i = 0; i < alecs.length; i++) {
            if (scores.get(String.valueOf(alecs[i])) > scores.get(String.valueOf(bobs[i]))) {
                countAlecsWins++;
            }
        }

        return countAlecsWins;

    }


    private static Map<String, Integer> getScores() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("1", 1);
        scores.put("2", 2);
        scores.put("3", 3);
        scores.put("4", 4);
        scores.put("5", 5);
        scores.put("6", 6);
        scores.put("7", 7);
        scores.put("8", 8);
        scores.put("9", 9);
        scores.put("T", 10);
        scores.put("J", 11);
        scores.put("Q", 12);
        scores.put("K", 13);
        scores.put("A", 14);

        return scores;
    }




    private static int solution(String A, String B) {
        int solution = 0;
        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();
        for (int i = 0; i < aChars.length; i++) {

            int aChar = getValue(aChars[i]);
            int bChar = getValue(bChars[i]);

            if (aChar > bChar)
                solution += 1;
        }

        return solution;
    }

    private static int getValue(char charcter) {
        switch (charcter) {
            case 'A':
                return 13;
            case 'K':
                return 12;
            case 'Q':
                return 11;
            case 'J':
                return 10;
            case 'T':
                return 9;
            case '9':
                return 8;
            case '8':
                return 7;
            case '7':
                return 6;
            case '6':
                return 5;
            case '5':
                return 4;
            case '4':
                return 3;
            case '3':
                return 2;
            case '2':
                return 1;
        }

        return 0;
    }
}
