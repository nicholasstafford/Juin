import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ActionBtnTxt extends Application 
{
	Pane pane = new Pane();
	Scene scene = new Scene(pane,400,400);
	
	@Override
	public void start(Stage primaryStage) 
	{
		Button bouton = new Button();
		Group group = new Group();
		bouton.setText("Mon Bouton");
		pane.getChildren().add(bouton);
		bouton.setLayoutX(20);
		bouton.setLayoutY(20);
		bouton.prefWidthProperty().bind(pane.widthProperty().divide(2));
		bouton.prefHeightProperty().bind(pane.heightProperty().divide(2));
		primaryStage.setScene(scene);
		primaryStage.show();
		bouton.setOnAction((event) ->
		{
			System.out.println("Bouton Cliqué");
		});
		
		TextField txt = new TextField();
		txt.setLayoutX(20);
		txt.setLayoutY(60);
		
		/*txt.setOnAction((event)->
		{
			System.out.println("Texte = " + txt.getText());
		});*/
		txt.textProperty().addListener((observable,oldValue,newValue)->
		{
			System.out.println("nouveau texte = "+newValue);
		});
		
		group.getChildren().add(bouton);
		group.getChildren().add(txt);
		
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}
