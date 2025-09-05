// package strings;

public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        // String regex = "[,\\.\\s]";
        // String[] myArray = s.split(regex);
        // String lastWord = myArray[myArray.length - 1];
        // return lastWord.length();

        int i = s.length() - 1;
        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            System.out.print(s.charAt(i) + " ");
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
