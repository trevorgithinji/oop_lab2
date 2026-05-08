import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RentalsGUI extends Application {

    @Override
    public void start(Stage stage) {
        Text lblCustomer = new Text("Customer:");
        ComboBox<String> comboCustomer = new ComboBox<>();
        comboCustomer.setPrefWidth(300);

        Text lblGenre = new Text("Genre:");
        ComboBox<String> comboGenre = new ComboBox<>();
        comboGenre.setPrefWidth(300);

        Text lblMovies = new Text("Movies:");
        ComboBox<String> comboMovies = new ComboBox<>();
        comboMovies.setPrefWidth(300);

        Button btnSaveRental = new Button("Save Rental");
        btnSaveRental.setPrefWidth(300);

        Text lblBorrowed = new Text("Borrowed:");
        ComboBox<String> comboBorrowed = new ComboBox<>();
        comboBorrowed.setPrefWidth(300);

        Button btnReturnMovie = new Button("Return Movie");
        btnReturnMovie.setPrefWidth(300);

        Text lblReturned = new Text("Returned:");
        ComboBox<String> comboReturned = new ComboBox<>();
        comboReturned.setPrefWidth(300);

        GridPane grid = new GridPane();
        grid.setMinSize(600, 550);
        grid.setPadding(new Insets(20));
        grid.setVgap(12);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: BEIGE;");


        grid.add(lblCustomer, 0, 0);
        grid.add(comboCustomer, 1, 0);
        grid.add(lblGenre, 0, 1);
        grid.add(comboGenre, 1, 1);
        grid.add(lblMovies, 0, 2);
        grid.add(comboMovies, 1, 2);

        grid.add(btnSaveRental, 1, 3);

        grid.add(lblBorrowed, 0, 4);

        grid.add(comboBorrowed, 1, 4);

        grid.add(btnReturnMovie, 1, 5);

        grid.add(lblReturned, 0, 6);
        grid.add(comboReturned, 1, 6);







        String btnStyle = "-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-weight: bold;";
        btnSaveRental.setStyle(btnStyle);
        btnReturnMovie.setStyle(btnStyle);

        String labelStyle = "-fx-font: normal bold 14pt 'serif';";
        lblCustomer.setStyle(labelStyle);
        lblGenre.setStyle(labelStyle);
        lblMovies.setStyle(labelStyle);
        lblBorrowed.setStyle(labelStyle);
        lblReturned.setStyle(labelStyle);


        Scene scene = new Scene(grid);
        stage.setTitle("VLS - Rental Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
