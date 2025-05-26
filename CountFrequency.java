import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.Map.Entry;
import java.util.Scanner;

public class CountFrequency {
    public static void solution(String str) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entrySet : map.entrySet()){
            System.out.println(entrySet);
        }
        // System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        String str = "MOOHIT";
        solution(str);
    }
}
