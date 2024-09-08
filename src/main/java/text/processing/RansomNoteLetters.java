package text.processing;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteLetters {

    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to store the frequency of characters in the magazine
        Map<Character, Integer> magazineMap = new HashMap<>();

        // Populate the map with the characters and their counts from the magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check each character in the ransomNote
        for (char c : ransomNote.toCharArray()) {
            // If the character is not present in the magazine or not enough characters are left, return false
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            // Otherwise, decrease the count of the character in the magazine map
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        // If all characters are matched, return true
        return true;
    }
}
