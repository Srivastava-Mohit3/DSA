package strings;

public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        String regex = "[,\\.\\s]";
        String[] myArray = s.split(regex);
        String lastWord = myArray[myArray.length - 1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
