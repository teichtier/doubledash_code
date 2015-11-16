package game;

import java.util.NoSuchElementException;

/**
 * Created by Stephan on 08.11.2015.
 */
public enum NumberOfPlayers {

    ONE(1), TWO(2);
    private final int amount;

    NumberOfPlayers(int amount) {
        this.amount = amount;
    }

    public static NumberOfPlayers get(int number) {
        for (NumberOfPlayers players : NumberOfPlayers.values()) {
            if (players.amount == number)
                return players;
        }
        throw new NoSuchElementException("There is no element with " + number);
    }
}
