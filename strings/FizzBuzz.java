import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        // List<String> li = new ArrayList<>();
        // for (int i = 1; i <= n; i++) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // li.add("FizzBuzz");
        // } else if (i % 3 == 0) {
        // li.add("Fizz");
        // } else if(i % 5 == 0) {
        // li.add("Buzz");
        // } else {
        // li.add(String.valueOf(i));
        // }
        // }
        // return li;

        List<String> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0)
                sb.append("Fizz");
            if (i % 5 == 0)
                sb.append("Buzz");

            // If nothing added, just use the number
            li.add(sb.length() == 0 ? String.valueOf(i) : sb.toString());
        }
        return li;
    }

    public static void main(String[] args) {
        int n = 15;
        for (String str : fizzBuzz(n)) {
            System.out.print(str + " ");
        }
    }

}