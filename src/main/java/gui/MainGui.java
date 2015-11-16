package gui;

import game.Main;
import game.Utils;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @since 16.11.2015
 */
public class MainGui extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(800, 600);
        draw(canvas.getGraphicsContext2D());
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void draw(GraphicsContext gc) throws Exception {
        Image backgroundImage = Utils.loadJavaFxImage("background.png");
        gc.drawImage(backgroundImage, 0, 0);

        Image characterImage = Utils.loadJavaFxImage(Main.parameters.getCharacterType().getSpriteName());
        gc.drawImage(characterImage, 50, 500);

        Image weaponImage = Utils.loadJavaFxImage(Main.parameters.getWeaponType().getSpriteName());
        gc.drawImage(weaponImage, 70, 500);

        Image badGuyImage = Utils.loadJavaFxImage("enemy.png");
        gc.drawImage(badGuyImage, 600, 500);

    }
}
