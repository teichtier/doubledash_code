import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {


    public static void main(String[] args) {
        doubledash doubledash = new doubledash();
        System.out.println("Übergebe Laufzeitparameter");
        /*Default Settings*/
        if(args.length==0) {
            System.out.println("No runtimeparameter set");
        }
        else if(contains(args, "esport")){
            doubledash.setDdLanguage(LangType.ENGLISH);
            doubledash.setDdScoreboard(new Scoreboard("Highscores"));
            doubledash.setDdDifficulty(Difficulty.HARD);
            System.out.println("Parameter esport set.");
            System.out.println("Language: "+doubledash.getDdLanguage().toString());
            System.out.println("Scoreboard "+doubledash.getDdScoreboard().Title+" available");
            System.out.println("Difficulty: "+doubledash.getDdDifficulty().toString());
        }
        else if(contains(args, "hardcore")){
            doubledash.setDdLanguage(LangType.ENGLISH);
            doubledash.setDdDifficulty(Difficulty.HARD);
            doubledash.setDdDirection(Direction.Right2Left);
            System.out.println("Parameter hardcore set");
            System.out.println("Language: "+doubledash.getDdLanguage().toString());
            System.out.println("Difficulty: "+doubledash.getDdDifficulty().toString());
            System.out.println("Direction: "+doubledash.getDdDirection().toString());
        }
        else if(contains(args, "multiplayer")){
            doubledash.setDdLanguage(LangType.GERMAN);
            doubledash.setDdNumberOfPlayers(NumberOfPlayers.TWO);
            doubledash.setDdDifficulty(Difficulty.EASY);
            System.out.println("Parameter multiplayer set");
            System.out.println("Language: "+doubledash.getDdLanguage().toString());
            System.out.println("Difficulty: "+doubledash.getDdNumberOfPlayers().toString());
            System.out.println("Direction: "+doubledash.getDdDirection().toString());
        }
    }
    /*Method for searching for a Value in an Array*/
    private static boolean contains(String[] myArray, String value ){
        for( String i: myArray) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
