//Arman Uddin
//CSC 221 Section P
//Assignment 1

package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Heart Rates");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text sceneTitle = new Text("Heart Rates");
		sceneTitle.setFont(Font.font("Ariel", FontWeight.NORMAL, 20));
		grid.add(sceneTitle,0,0,2,1);
		
		Label firstName = new Label("First Name: ");
		grid.add(firstName, 0, 1);
		TextField firstTextField = new TextField();
		grid.add(firstTextField,1,1);
		
		Label lastName = new Label("Last Name: ");
		grid.add(lastName, 0, 2);
		TextField lastTextField = new TextField();
		grid.add(lastTextField,1,2);
		
		Label dateOfBirth = new Label("Date Of Birth\n(mm-dd-yyyy): ");
		grid.add(dateOfBirth, 0, 3);
		TextField dateTextField = new TextField();
		grid.add(dateTextField,1,3);
		
		Button btn = new Button("Submit");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn,1,4);
		
		Text actionTarget = new Text();
		grid.add(actionTarget, 0, 6,2,2);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
		    @Override
		    public void handle(ActionEvent e) {
		    	verify(firstTextField.getText(),lastTextField.getText(),dateTextField.getText(),actionTarget);
		    }
		});
		
		
		Scene scene =new Scene(grid,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void verify(String firstName,String lastName,String dateOfBirth,Text actionTarget)
	{
		int day = 0;
		int month = 0;
		int year = 0;
		try {
			month = Integer.parseInt(dateOfBirth.substring(0, 2));
			day = Integer.parseInt(dateOfBirth.substring(3, 5));
			year = Integer.parseInt(dateOfBirth.substring(6, 10));
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			e.printStackTrace();
			System.exit(0);
		}
		HeartRates hr = new HeartRates(firstName,lastName,day,month,year);
		System.out.println("Name: "+hr.getFirstName()+" "+hr.getLastName());
		hr.printDateOfBirth();
		System.out.println("Age: "+hr.getAge());
		System.out.println("Maximum Heart Rate(Beats per Minute): "+hr.maxHeartRate());
		System.out.println(hr.targetHeartRate());
		actionTarget.setFill(Color.DARKRED);
        actionTarget.setText("Name: "+hr.getFirstName()+" "+hr.getLastName()+"\n"+
        					 hr.getDateOfBirth()+"\n"+
        					 "Age: "+hr.getAge()+"\n"+
        					 "Maximum Heart Rate(Beats per Minute): "+hr.maxHeartRate()+"\n"+
        					 hr.targetHeartRate());
	}
}
