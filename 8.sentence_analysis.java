public class SentenceAnalysis {
    public static void main(String[] args) {
        String sentence = "Java Programming is FUN and Powerful!";

        System.out.println("Character count: " + sentence.length());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        System.out.println("Replaced: " + sentence.replace(" ", "_"));
        System.out.println("Contains 'Java': " + sentence.contains("Java"));

        int start = sentence.indexOf("FUN");
        int end = start + 3;
        System.out.println("Word 'FUN' in lowercase: " + sentence.substring(start, end).toLowerCase());
    }
}
