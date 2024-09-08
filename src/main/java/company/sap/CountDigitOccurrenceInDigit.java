package company.sap;

import java.util.HashMap;

public class CountDigitOccurrenceInDigit {

    //Given a number N and a digit D, the task is to count the occurrences of D in N.

    public int countDigitOccurrences1(long number, int digit) {
        char[] digits = String.valueOf(number).toCharArray();
        int count = 0;

        for (char c : digits) {
            if (digit ==  Character.getNumericValue(c)) {
                count++;
            }
        }

        return count;
    }


    public  int  countOccurrences2(int needle, int haystack)
    {
        int  answer = 0;
        // Write your code here
        String haystackAsString = String.valueOf(haystack);
        String needleAsString = String.valueOf(needle);
        int index = 0;
        while((index = haystackAsString.indexOf(needleAsString, index)) != -1) {
            answer++;
            index++;
        }
        return answer;
    }


    public  int countOccurrences3(long n, int d) {
        // Initialize hash map with keys 0 to 9 and values 0
        HashMap<Integer, Integer> digitCounts = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            digitCounts.put(i, 0);
        }

        // Convert number to string and loop through its digits
        String numString = Long.toString(n);
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            digitCounts.put(digit, digitCounts.get(digit) + 1);
        }

        // Return count for the digit we are interested in
        return digitCounts.get(d);
    }



}
