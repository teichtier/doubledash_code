
public class Main {


    public static void main(String[] args) {
        DoubleDash doubleDash = new DoubleDash();
        System.out.println("Übergebe Laufzeitparameter");
        /*Default Settings*/
        if (args.length == 0) {
            System.out.println("No runtimeparameter set");
        } else if (contains(args, "esport")) {
            doubleDash.setDdLanguage(LangType.ENGLISH);
            doubleDash.setDdScoreboard(new Scoreboard("Highscores"));
            doubleDash.setDdDifficulty(Difficulty.HARD);
            System.out.println("Parameter esport set.");
            System.out.println("Language: " + doubleDash.getDdLanguage().toString());
            System.out.println("Scoreboard " + doubleDash.getDdScoreboard().Title + " available");
            System.out.println("Difficulty: " + doubleDash.getDdDifficulty().toString());
        } else if (contains(args, "hardcore")) {
            doubleDash.setDdLanguage(LangType.ENGLISH);
            doubleDash.setDdDifficulty(Difficulty.HARD);
            doubleDash.setDdDirection(Direction.Right2Left);
            System.out.println("Parameter hardcore set");
            System.out.println("Language: " + doubleDash.getDdLanguage().toString());
            System.out.println("Difficulty: " + doubleDash.getDdDifficulty().toString());
            System.out.println("Direction: " + doubleDash.getDdDirection().toString());
        } else if (contains(args, "multiplayer")) {
            doubleDash.setDdLanguage(LangType.GERMAN);
            doubleDash.setDdNumberOfPlayers(NumberOfPlayers.TWO);
            doubleDash.setDdDifficulty(Difficulty.EASY);
            System.out.println("Parameter multiplayer set");
            System.out.println("Language: " + doubleDash.getDdLanguage().toString());
            System.out.println("Difficulty: " + doubleDash.getDdNumberOfPlayers().toString());
            System.out.println("Direction: " + doubleDash.getDdDirection().toString());
        }
    }

    /*Method for searching for a Value in an Array*/
    private static boolean contains(String[] myArray, String value) {
        for (String i : myArray) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
