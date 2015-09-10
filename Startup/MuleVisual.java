/**
   @author Alexandra Link
   @Version 1.0
*/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.*;
import javafx.animation.Animation;
import javafx.scene.paint.Color;

public class MuleVisual extends Application {
   
   public static void main(String[] args) {
   		launch(args);
   }
   
   @Override
   public void start(Stage primaryStage) {
   	   Text nameTitle = new Text(400, 350, "M.U.L.E.");
       nameTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 150));
       nameTitle.setFill(Color.RED);
   	   //nameTitle.setTextAlignment(TextAlignment.JUSTIFY);
   	   Group g = new Group(nameTitle);
       Scene scene = new Scene(g);
   	   scene.setFill(Color.GRAY);
   	   Stage stage = new Stage();
   	   stage.setTitle("MULE");
       stage.setScene(scene);
   	   stage.setFullScreen(true);
   	   stage.show();
   }
}