import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormWithCheckbox extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form with Checkbox");

        // Create the Label, TextField, CheckBox, and Button
        Label instructionLabel = new Label("Enter your name:");
        TextField nameField = new TextField();
        CheckBox checkBox = new CheckBox("Subscribe to newsletter");
        Button submitButton = new Button("Submit");

        // Label to display the entered data
        Label resultLabel = new Label();

        // Button click action
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            boolean isSubscribed = checkBox.isSelected();
            resultLabel.setText("Name: " + name + ", Subscribed: " + isSubscribed);
        });

        // Layout with VBox
        VBox vbox = new VBox(10);  // Vertical spacing of 10
        vbox.getChildren().addAll(instructionLabel, nameField, checkBox, submitButton, resultLabel);

        // Set the scene and show the stage
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
