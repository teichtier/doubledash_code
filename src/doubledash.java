import javax.security.auth.callback.LanguageCallback;

/**
 * Created by Stephan on 08.11.2015.
 */
public class doubledash {
    /*Listing of Parameters*/

    private LangType ddLanguage;
    private Scoreboard ddScoreboard = null;
    private NumberOfPlayers  ddNumberOfPlayers;
    private Difficulty ddDifficulty;
    private Direction ddDirection;

    /*Default Constructor*/
    doubledash(){
        ddLanguage = LangType.ENGLISH;
        ddScoreboard = null;
        ddNumberOfPlayers = NumberOfPlayers.ONE;
        ddDifficulty = Difficulty.NORMAL;
        ddDirection = Direction.Left2Right;
    }

    public LangType getDdLanguage() {
        return ddLanguage;
    }

    public void setDdLanguage(LangType ddLanguage) {
        this.ddLanguage = ddLanguage;
    }

    public Scoreboard getDdScoreboard() {
        return ddScoreboard;
    }

    public void setDdScoreboard(Scoreboard ddScoreboard) {
        this.ddScoreboard = ddScoreboard;
    }

    public NumberOfPlayers getDdNumberOfPlayers() {
        return ddNumberOfPlayers;
    }

    public void setDdNumberOfPlayers(NumberOfPlayers ddNumberOfPlayers) {
        this.ddNumberOfPlayers = ddNumberOfPlayers;
    }

    public Difficulty getDdDifficulty() {
        return ddDifficulty;
    }

    public void setDdDifficulty(Difficulty ddDifficulty) {
        this.ddDifficulty = ddDifficulty;
    }

    public Direction getDdDirection() {
        return ddDirection;
    }

    public void setDdDirection(Direction ddDirection) {
        this.ddDirection = ddDirection;
    }
}
