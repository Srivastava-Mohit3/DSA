public class ReverseWordsString {
    public static String reverseWords(String s) {
        String words[] = s.split(" +");
        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.print("'");
        System.out.print(reverseWords(s));
        System.out.print("'");
        String check = "$#%kjhdkjbskj#54jkhb335##$%^&";
        System.out.println();
        System.out.println(check.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
