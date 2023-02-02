package disemvowels;

public class Disemvowels {
    /**
     * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
     * @param str
     * @return
     */
    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

    public static void main(String[] args) {
        System.out.println(Disemvowels.disemvowel("This website is for losers LOL!")); // returns Ths wbst s fr lsrs LL!
        System.out.println(Disemvowels.disemvowel("No offense but,\nYour writing is among the worst I've ever read")); // returns N ffns bt,\nYr wrtng s mng th wrst 'v vr rd
    }
}
