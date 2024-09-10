package text.processing;

public class FirstOccurranceString {


    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }

        int index = 0;

        while (index < haystack.length()) {
            if ((haystack.length() - index) < needle.length()) {
                return -1;
            }
            int needleIndex = 0;
            while (needleIndex < needle.length()) {
                if (haystack.charAt(index + needleIndex) != needle.charAt(needleIndex)) {
                    break;
                }
                needleIndex++;
            }
            if (needleIndex == needle.length()) {
                return index;
            }
            index++;
        }

        return 0;
    }

    public int strStrOriginal(String haystack, String needle) {
        // Handle the edge case where the needle is an empty string
        if (needle.isEmpty()) {
            return 0;
        }

        // Use the indexOf method to find the first occurrence of the needle in the haystack
        return haystack.indexOf(needle);
    }


}
