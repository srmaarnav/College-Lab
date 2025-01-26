import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileChooserExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Choose a File");

        // Create the TextField and Button
        TextField filePathField = new TextField();
        filePathField.setEditable(false);  // Make the text field non-editable
        Button chooseFileButton = new Button("Choose File");

        // Set action for button click
        chooseFileButton.setOnAction(e -> {
            // Create a FileChooser
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("All Files", "*.*"));

            // Show the open file dialog
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                // Set the absolute path in the TextField
                filePathField.setText(selectedFile.getAbsolutePath());
            }
        });

        // Layout with VBox
        VBox vbox = new VBox(10);  // Vertical spacing of 10
        vbox.getChildren().addAll(chooseFileButton, filePathField);

        // Set the scene and show the stage
        Scene scene = new Scene(vbox, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
