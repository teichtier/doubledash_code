package game;

import gui.MainGui;
import javafx.application.Application;

public class Main {

    public static DashParameters parameters;

    public static void main(String[] args) {

        DashParameters.DashParametersBuilder builder = DashParameters.builder();

        builder.getValueOfParameter(args, "char").ifPresent(builder::character);
        builder.getValueOfParameter(args, "weapon").ifPresent(builder::weapon);
        builder.getValueOfParameter(args, "difficulty").ifPresent(builder::difficulty);
        builder.getValueOfParameter(args, "language").ifPresent(builder::langType);
        builder.getValueOfParameter(args, "multiplayer").ifPresent(s -> {
            if (s.toLowerCase().equals("y")) {
                builder.numberOfPlayers(2);
            }
        });

        parameters = builder.build();
        System.out.println(parameters);
        Application.launch(MainGui.class);
    }

}
