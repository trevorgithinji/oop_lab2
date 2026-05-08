import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Create the UI Components

        Text text1 = new Text("Genres: ");
        Text text2 = new Text("Name:");
        Text text3 = new Text("Registered: ");

        TextField textField1 = new TextField();

        ComboBox<String> comboBox1 = new ComboBox<>();
        ComboBox<String> comboBox2 = new ComboBox<>();

        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");

        comboBox1.setPrefWidth(200);
        textField1.setPrefWidth(200);
        button1.setPrefWidth(200);
        comboBox2.setPrefWidth(200);
        button2.setPrefWidth(200);

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(comboBox1, 1, 0);

        gridPane.add(text2, 0, 1);
        gridPane.add(textField1, 1, 1);

        gridPane.add(button1, 1, 2);

        gridPane.add(text3, 0, 3);
        gridPane.add(comboBox2, 1, 3);

        gridPane.add(button2, 1, 4);

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Movies");
        primaryStage.setScene(scene);
        primaryStage.show();


        String btnStyle = "-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-weight: bold;";
        button1.setStyle(btnStyle);
        button2.setStyle(btnStyle);
        gridPane.setStyle("-fx-background-color: BEIGE;");


    }

    public static void main(String[] args) {
        launch(args);
    }
}

