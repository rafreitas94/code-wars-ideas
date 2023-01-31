package reversed_strings;

public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ReversedStrings.solution("teste"));
    }
}
