package game;

import java.util.List;

/**
 * Created by Stephan on 08.11.2015.
 */
public class Scoreboard {
    String Title;
    List<Integer> Scores;
    List<String> Username;
    /**Beispiel
     *
     * game.Scoreboard
     * Datum        Username Charakter Punkteanzahl
     * DD.MM.YYYY   Stephan  Rambo       200
     * **/
    Scoreboard(String sTitle){
        Title=sTitle;
    }
}
