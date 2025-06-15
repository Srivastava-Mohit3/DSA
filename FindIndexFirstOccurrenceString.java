public class FindIndexFirstOccurrenceString {
    // public static boolean compare(String hayStack, String needle, int i) {
    //     for (int j = 0; j < needle.length(); j++) {
    //         if((i+j) >= hayStack.length() || hayStack.charAt(i+j) != needle.charAt(j)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static int solution(String hayStack, String needle) {
    //     for (int i = 0; i < hayStack.length(); i++) {
    //         if(hayStack.charAt(i) == needle.charAt(0) && compare(hayStack, needle, i)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int solution(String hayStack, String needle) {
        for (int i = 0; i < hayStack.length(); i++) {
            if(hayStack.charAt(i) == needle.charAt(0)) {
                String subString = hayStack.substring(i, i+needle.length());
                System.out.println(subString);
                if (subString.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        String haystack = "mmohitsrimohit", needle = "mohit";
        System.out.println(solution(haystack, needle));
    }
}
