package ro.fasttrackit.curs10.homework10.ex1;

public class Ex1Utils {

    public static String makeFirstLetterCapital(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static String ensureNotEmpty(String word) {

        return word == null || "".equals(word.trim()) ? "n/a" : word;
    }
}
