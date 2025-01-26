import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI controls
        Label label = new Label("Welcome to JavaFX!");
        Button button1 = new Button("Click Me");
        Button button2 = new Button("Exit");

        // Add action to buttons
        button1.setOnAction(e -> label.setText("You clicked the button!"));
        button2.setOnAction(e -> primaryStage.close());

        // Create VBox layout and add controls
        VBox vbox = new VBox(10); // 10 is the spacing between elements
        vbox.getChildren().addAll(label, button1, button2);

        // Create a scene and add it to the stage
        Scene scene = new Scene(vbox, 300, 200); // 300x200 is the window size
        primaryStage.setTitle("VBox Layout Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

