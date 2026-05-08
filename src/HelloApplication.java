//package com.example.customer;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage)  {


        //Create Labels and TextFields for display.
        Text text1 = new Text ("Name:");
        TextField textField1 = new TextField();
        textField1.setPrefWidth(300);


        Text text2 = new Text ("Phone:");
        TextField textField2 = new TextField();
        textField2.setPrefWidth(300);

        Text text3 = new Text ("Email:");
        TextField textField3 = new TextField();
        textField3.setPrefWidth(300);

        Text text4 = new Text ("Registered:");
        ComboBox<String> registeredCombo = new ComboBox<>();
        registeredCombo.setPrefWidth(300);


        //Create the Buttons.
        Button buttonSave = new Button("Save");
        buttonSave.setPrefWidth(300);
        Button buttonRemove = new Button("Remove");
        buttonRemove.setPrefWidth(300);

        //Create a Grid Pane,Size and padding
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(20));

        //Create the Horizontal and Vertical gaps
        gridPane.setVgap(15);
        gridPane.setHgap(10);

        //Create the Alignment
        gridPane.setAlignment(Pos.CENTER);

        //Create the Nodes
        gridPane.add(text1,0,0);
        gridPane.add(textField1, 1, 0);

        gridPane.add(text2,0,1);
        gridPane.add(textField2,1,1);

        gridPane.add(text3,0,2);
        gridPane.add(textField3,1,2);
        gridPane.add(buttonSave, 1,3);//Save Button next to Email.

        gridPane.add(text4,0,4);
        gridPane.add(registeredCombo,1,4);
        gridPane.add(buttonRemove,1,5);//Remove button next to DropDown

        //Create the Styles
        String btnStyle = "-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt; -fx-font-weight: bold;";
        buttonSave.setStyle(btnStyle);
        buttonRemove.setStyle(btnStyle);

        String textStyle = "-fx-font: normal bold 20px 'serif'";
        text1.setStyle(textStyle);
        text2.setStyle(textStyle);
        text3.setStyle(textStyle);
        text4.setStyle(textStyle);
        gridPane.setStyle("-fx-background-color: BEIGE; ");

        //Create a scene object and show it.
        Scene scene = new Scene(gridPane,700,500);
        stage.setTitle("Customer Registration");
        stage.setScene(scene);
        stage.show();//The window should appear.
    }
}

