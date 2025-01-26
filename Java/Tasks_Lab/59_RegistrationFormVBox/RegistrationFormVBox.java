import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegistrationFormVBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Registration Form");

        VBox vbox = new VBox(10);  // Vertical spacing of 10
        vbox.setPadding(new javafx.geometry.Insets(20, 20, 20, 20));

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();  
        
        Button registerButton = new Button("Register");

        vbox.getChildren().addAll(nameLabel, nameField, emailLabel, emailField, passwordLabel, passwordField, registerButton);

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
