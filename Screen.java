import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Screen extends Application{

    private Text userChoice = new Text("Please Choose something");

    public void start(Stage primaryStage){
        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(userInput());
        Scene scene = new Scene(stackPane,500,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Stone Paper Sissors");
        primaryStage.show();
    }

    /**
     * @return
     */
    public VBox userInput(){

        Button stone = new Button("Stone");
        Button paper = new Button("Paper");
        Button sissor = new Button("Sissor");

      
        stone.setOnAction(event->{
            userChoice.setText("Stone");
        });
        paper.setOnAction(event->{
            userChoice.setText("paper");
        });
        sissor.setOnAction(event->{
            userChoice.setText("sissor");
        });

        Region gap = new Region();
        gap.setPrefHeight(50);

        compChoice.setText(compOutput());

        VBox vbox = new VBox(10,gap, stone,paper,sissor,userChoice,compChoice);
        vbox.setAlignment(Pos.TOP_CENTER);
        return vbox;
    }
    Text compChoice = new Text();

    public String compOutput (){

        List<String> al = new LinkedList<String>();
        al.add("stone");
        al.add("paper");
        al.add("sissor");

        Random rand = new Random();
        int randIndex = rand.nextInt(al.size());
        String randEle = al.get(randIndex);
        return randEle;

    }
    public static void main(String [] args){
        launch(args);
    }
}