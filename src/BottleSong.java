public class BottleSong {
    private static String endingS;

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
        for (int i = startBottles; i > startBottles - takeDown; ) {
            String amount = returnWord(i);
            newString.append(String.format("%s green bottle%s hanging on the wall, %n", capitalizeFirstLetter(amount), endingS));
            newString.append(String.format("%s green bottle%s hanging on the wall, %n", capitalizeFirstLetter(amount), endingS));
            newString.append(String.format("And if one green bottle should accidentally fall,%n"));
            i--;
            amount = returnWord(i);
            newString.append(String.format("There'll be %s green bottle%s hanging on the wall.%n%n", amount, endingS));
        }
        return newString.toString();
    }

    public static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public static String returnWord(int i) {
        if (i == 1) {
            endingS = "";
        }
        if (i != 1) {
            endingS = "s";
        }
        return switch (i) {
            case 10 -> "ten";
            case 9 -> "nine";
            case 8 -> "eight";
            case 7 -> "seven";
            case 6 -> "six";
            case 5 -> "five";
            case 4 -> "four";
            case 3 -> "three";
            case 2 -> "two";
            case 1 -> "one";
            default -> "no";
        };
    }
}
