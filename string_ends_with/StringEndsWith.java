package string_ends_with;

public class StringEndsWith {
    /**
     * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
     * @param str
     * @param ending
     * @return
     */
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(StringEndsWith.solution("abc", "bc")); // returns true
        System.out.println(StringEndsWith.solution("abc", "d")); // returns false
    }
}