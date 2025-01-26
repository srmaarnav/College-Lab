import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorGridPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        // Create the TextField to display calculations
        TextField display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        // Create a GridPane layout
        GridPane grid = new GridPane();
        grid.setVgap(10);  // Vertical gap
        grid.setHgap(10);  // Horizontal gap
        grid.setAlignment(Pos.CENTER);

        // Define the buttons
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Add buttons to the grid
        int row = 1, col = 0;
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setPrefSize(60, 60);
            grid.add(button, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        // Add the display TextField at the top
        grid.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(grid, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
