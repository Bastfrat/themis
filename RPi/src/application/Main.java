package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.application.Preloader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
//import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.image.*;


import view.*;
import model.*;

import java.util.Random;

import controller.*;

/*
 SPIDevice pour faire spécif matériel (module de communication)
 Permet de communiquer entre Code Java et ce qui arrive/part sur le bus SPI
 */
	
public class Main extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		Application.launch(Main.class,args);
		
	}
	@Override
	public void start(Stage window) throws Exception {
		//Test
		//Node n = PerformancePad.getView();
		//Node n1 = PushButton();
		int width=4;
		int lenght=4;
		
		Group root = new Group();
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(5));
		grid.setHgap(8);
        grid.setVgap(8);

        grid.setMinSize(800, 480);
	    Button[][] matrix = new Button[width][lenght]; // allocates the size of the matrix
	    
	    // runs a for loop and an embedded for loop to create buttons to fill the size of the matrix
	    // these buttons are then added to the matrix
	    int i=0;
	    for(int x = 0; x <lenght; x++)
	    {
	            for(int y = 0; y <width; y++)
	            {
	            	i=i+1;
	            	matrix[x][y] = new Button(/*"(" + rand1 + ")"*/); //creates new random binary button     
	                matrix[x][y].setText("(" + i + ")");   // Sets the text inside the matrix
	                
	                matrix[x][y].setOnAction(new EventHandler<ActionEvent>() {

	                    public void handle(ActionEvent event) {
	                        System.out.println("Pad pushed");
	                    }
	                });
	                
	                grid.add(matrix[x][y], y, x);
	                //
	            }
	    }        

		/*GridPane grid = new GridPane();
		grid.setPadding(new Insets(5));
		grid.setHgap(8);
        grid.setVgap(8);
		Button btn1 =new Button();
		Button btn2 =new Button();
		Button btn3 =new Button();
		Button btn4 =new Button();
		Button btn5 =new Button();
		Button btn6 =new Button();
		grid.add(btn1,1,1);
		grid.add(btn2,1,2);
		grid.add(btn3,1,3);
		grid.add(btn4,2,1);
		grid.add(btn5,2,2);
		grid.add(btn6,2,3);*/
	    root.getChildren().add(grid);
		Scene s = new Scene(root, 800,480);
		window.setScene(s);
		window.setTitle("Loader");
		window.setResizable(false);
		window.show();
	}
	


	
}

