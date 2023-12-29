public class BottleSong {
    private final static String[] numbersAsWords = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    public static void main(String[] args) {
        System.out.println(createString(3, 1));
        System.out.println(createString(10, 1));
        System.out.println(createString(2, 1));
        System.out.println(createString(1, 1));
        System.out.println(createString(3, 3));
        System.out.println(createString(10, 10));
    }

    public static String createString(int startBottles, int takeDown) {
        StringBuilder newString = new StringBuilder();
        for (int i = startBottles; i > startBottles - takeDown; i--) {
            newString.append(String.format("%s green bottle%s hanging on the wall, %n", numbersAsWords[i], (i != 1) ? "s" : ""));
            newString.append(String.format("%s green bottle%s hanging on the wall, %n", numbersAsWords[i], (i != 1) ? "s" : ""));
            newString.append(String.format("And if one green bottle should accidentally fall,%n"));
            newString.append(String.format("There'll be %s green bottle%s hanging on the wall.%n%n", numbersAsWords[i-1].toLowerCase(), (i-1) != 1 ? "s" : ""));
        }
        return newString.toString();
    }
}
