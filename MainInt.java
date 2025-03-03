import javafx.stage.Stage;
import javafx.application.Application;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.CornerRadii;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;



public class MainInt extends Application {

    private TextArea textArea;
    @SuppressWarnings("unused")
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Kyzer Module 3 Option 1");

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem dateTime = new MenuItem("Get Time");
        MenuItem saveToFile = new MenuItem("Save");
        MenuItem changeColor = new MenuItem("Change Hue of Green");
        MenuItem exit = new MenuItem("Exit");

        menu.getItems().addAll(dateTime, saveToFile, changeColor, exit);
        menuBar.getMenus().add(menu);

        textArea = new TextArea();
        textArea.setEditable(true);
        VBox vbox = new VBox(textArea);
        vbox.setPrefHeight(300);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(vbox);

        dateTime.setOnAction(e -> printDateTime());
        saveToFile.setOnAction(e -> saveToFile());
        changeColor.setOnAction(e -> changeBackgroundColor(root));
        exit.setOnAction(e -> primaryStage.close());

        Scene scene = new Scene(root, 1200, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void printDateTime() {
        LocalDateTime now = LocalDateTime.now();
        String rightNow = now.toString();
        textArea.setText(rightNow);
    }

    private void saveToFile() {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write(textArea.getText());
            System.out.println("Successfully saved to file log.txt!");
        } catch (IOException error) {
            System.out.println("Something went wrong :(");
            error.printStackTrace();
        }
    }

    private void changeBackgroundColor(BorderPane root) {
        Random random = new Random();
        int green = random.nextInt(255);
        Color color = Color.rgb(0, green, 0);
        BackgroundFill fill = new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY);
        root.setBackground(new Background(fill));
    }
}