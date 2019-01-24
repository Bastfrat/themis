package application;
	
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import view.*;
import model.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.geometry.Pos;
//import javafx.application.Preloader;
import javafx.stage.Stage;
//import javafx.stage.Window;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import java.util.*;
import controller.component.Control;

/*
 SPIDevice pour faire spécif matériel (module de communication)
 Permet de communiquer entre Code Java et ce qui arrive/part sur le bus SPI
 */

/**
 * Construction of the stage of the simulator with the corresponding scene.
 * The scene is composed of 3 groups : Controls,Screen and Performance Pads.
 * 
 */
	
public class Main extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		Application.launch(Main.class,args);
		
	}

	@Override
	public void start(Stage window) throws Exception {
	


	//Instanciation of panes for the 3 groups 

	BorderPane layout = new BorderPane();
	layout.setStyle("-fx-background-color: #222;");
        layout.setPadding(new Insets(10));
        
        GridPane encoders = new GridPane();
        //encoders.setStyle("-fx-background-color: black;");
        encoders.setHgap(10);
        encoders.setVgap(10);
        
        GridPane pads = new GridPane();
        pads.setPadding(new Insets(80));
        pads.setHgap(10);
        pads.setVgap(10);
        
        AnchorPane screen = new AnchorPane();
        AnchorPane.setLeftAnchor(screen, 410.0);
        AnchorPane.setLeftAnchor(screen, 230.0);
        
        ImageView iv1 = new ImageView(new Image("resources/img/logo.png"));
        iv1.setStyle("-fx-border-color : grey");
        screen.getChildren().add(iv1);
        


	//Instanciation of nodes grids for controls and sliders.
	//Needs to be done in an appropriate method in the View package.

        GridPane buttonGroup1 = new GridPane();
        buttonGroup1.setStyle("-fx-background-color: black;"
        		+"-fx-border-color: magenta;");
        buttonGroup1.setHgap(10);
        buttonGroup1.setVgap(10);
        buttonGroup1.setMinSize(250,200);
        buttonGroup1.setMaxSize(250,200);
        buttonGroup1.setPadding(new Insets(0, 10, 0, 10));
        
        GridPane buttonGroup2 = new GridPane();
        buttonGroup2.setStyle("-fx-background-color: black;"
        		+"-fx-border-color: magenta;");
        buttonGroup2.setHgap(10);
        buttonGroup2.setVgap(10);
        buttonGroup2.setMinSize(250,200);
        buttonGroup2.setMaxSize(250,200);
        buttonGroup2.setPadding(new Insets(0, 10, 0, 10));
        
        GridPane buttonGroup3 = new GridPane();
        buttonGroup3.setStyle("-fx-background-color: black;"
        		+"-fx-border-color: cyan;");
        buttonGroup3.setHgap(10);
        buttonGroup3.setVgap(10);
        buttonGroup3.setMinSize(250,200);
        buttonGroup3.setMaxSize(250,200);
        buttonGroup3.setPadding(new Insets(0, 10, 0, 10));
        
        GridPane buttonGroup4 = new GridPane();
        buttonGroup4.setStyle("-fx-background-color: black;"
        		+"-fx-border-color: yellow;");
        buttonGroup4.setHgap(10);
        buttonGroup4.setVgap(10);
        buttonGroup4.setMinSize(250,200);
        buttonGroup4.setMaxSize(250,200);
        buttonGroup4.setPadding(new Insets(0, 10, 0, 10));
        
        GridPane buttonGroup5 = new GridPane();
        buttonGroup5.setStyle("-fx-background-color: black;"
        		+"-fx-border-color: yellow;");
        buttonGroup5.setHgap(10);
        buttonGroup5.setVgap(10);
        buttonGroup5.setMinSize(250,200);
        buttonGroup5.setMaxSize(250,200);
        buttonGroup5.setPadding(new Insets(0, 10, 0, 10));
        
        GridPane buttonGroup6 = new GridPane();
        buttonGroup6.setStyle("-fx-background-color: black;"
        		+"-fx-border-color: magenta;");
        buttonGroup6.setHgap(10);
        buttonGroup6.setVgap(10);
        buttonGroup6.setMinSize(250,200);
        buttonGroup6.setMaxSize(250,200);
        buttonGroup6.setPadding(new Insets(0, 10, 0, 10));



	//Instanciation of Themis modules from the Model package.
	//Each parameter lists are definded in the appropriate class of the Model package.
		
	VcoCEM3340 vco1 = new VcoCEM3340();
	VcoLM13700 vco2 = new VcoLM13700();
	MixerV2140D mixer = new MixerV2140D();
	VcfCEM3320 vcf = new VcfCEM3320();
	VcaLM13700 vca = new VcaLM13700();
	ADSREnveloppe adsr = new ADSREnveloppe();
	List<SynthParameter<?>> paramsVCO1 = vco1.getParameters();
	List<SynthParameter<?>> paramsVCO2 = vco2.getParameters();
	List<SynthParameter<?>> paramsMixer = mixer.getParameters();
	List<SynthParameter<?>> paramsVcf = vcf.getParameters();
	List<SynthParameter<?>> paramsVca = vca.getParameters();
	List<SynthParameter<?>> paramsAdsr = adsr.getParameters();
	
	/**
	 * For each parameters list : 
	 * - The group of parameters is labeled with the name of the instanciate module
	 * - A FOR loop scans the list and add a controller (which can be a slider or whatever depending of the parameter type)
	 *   The attributes of the controller is definded in the package Controller.component in the class corresponding to the parameter type.
	 * - The freshly created controller is added to the next node of the corresponding group.
	 * Those steps should also be in a method.
	 */

	int i=0;
	for (SynthParameter<?> p : paramsVCO1) {
		i=i+1;
		Label title = new Label("VCO1");
		title.setStyle("-fx-text-fill: magenta;");
		Label label = new Label(p.getLabel());
		label.setStyle("-fx-text-fill: lightpink;");
		Control c = p.createControl();
		System.out.println(p);
		Node n = c.getJavaFXView();
		buttonGroup1.add(title,2,0);
		buttonGroup1.add(n,i,1);
		//layout.add(lbl,i,1);
		buttonGroup1.add(label,i,2);
	}/*
	i=0;
	for (SynthParameter<?> p : paramsVCO2) {
		i=i+1;
		Label title = new Label("VCO2");
		title.setStyle("-fx-text-fill: magenta;");
		Label label = new Label(p.getLabel());
		label.setStyle("-fx-text-fill: lightpink;");
		Control c = p.getControl();
		System.out.println(p);
		Node n = c.createJavaFXView();
		buttonGroup2.add(title,2,0);
		buttonGroup2.add(n,i,1);
		//layout.add(lbl,i,1);
		buttonGroup2.add(label,i,2);
	}
	i=0;
	for (SynthParameter<?> p : paramsMixer) {
		i=i+1;
		Label title = new Label("MIXER");
		title.setStyle("-fx-text-fill: cyan;");
		Label label = new Label(p.getLabel());
		label.setStyle("-fx-text-fill: lightblue;");
		Control c = p.getControl();
		System.out.println(p);
		Node n = c.createJavaFXView();
		buttonGroup3.add(title,2,0);
		buttonGroup3.add(n,i,1);
		//layout.add(lbl,i,1);
		buttonGroup3.add(label,i,2);
	}
	i=0;
	for (SynthParameter<?> p : paramsVcf) {
		i=i+1;
		Label title = new Label("VCF");
		title.setStyle("-fx-text-fill: yellow;");
		Label label = new Label(p.getLabel());
		label.setStyle("-fx-text-fill: lightyellow;");
		Control c = p.getControl();
		System.out.println(p);
		Node n = c.createJavaFXView();
		buttonGroup4.add(title,2,0);
		buttonGroup4.add(n,i,1);
		//layout.add(lbl,i,1);
		buttonGroup4.add(label,i,2);
	}
	i=0;
	for (SynthParameter<?> p : paramsVca) {
		i=i+1;
		Label title = new Label("VCA");
		title.setStyle("-fx-text-fill: yellow;");
		Label label = new Label(p.getLabel());
		label.setStyle("-fx-text-fill: lightyellow;");
		Control c = p.getControl();
		System.out.println(p);
		Node n = c.createJavaFXView();
		buttonGroup5.add(title,2,0);
		buttonGroup5.add(n,i,1);
		//layout.add(lbl,i,1);
		buttonGroup5.add(label,i,2);
	}
	i=0;
	for (SynthParameter<?> p : paramsAdsr) {
		i=i+1;
		Label title = new Label("ADSR");
		title.setStyle("-fx-text-fill: magenta;");
		Label label = new Label(p.getLabel());
		label.setStyle("-fx-text-fill: lightpink;");
		Control c = p.getControl();
		System.out.println(p);
		Node n = c.createJavaFXView();
		buttonGroup6.add(title,2,0);
		buttonGroup6.add(n,i,1);
		//layout.add(lbl,i,1);
		buttonGroup6.add(label,i,2);
	}		*/
	i=0;
	   for(int x = 0; x <8; x++){
	   	for(int y = 0; y <4; y++){
	          	i=i+1;
	          	Button butt = new Button();
	          	butt.setMinSize(70.0,70.0);
	          	butt.setStyle("-fx-background-color : white;");
	          	pads.add(butt,x,y);
	       }
	   }
	          		
	
	// Adding every controls groups in the Control Group and the 3 groups in the layout of the scene
	// And display the final result

	encoders.add(buttonGroup1,0,0);
	encoders.add(buttonGroup2,1,0);
	encoders.add(buttonGroup3,2,0);
	encoders.add(buttonGroup4,0,1);
	encoders.add(buttonGroup5,1,1);
	encoders.add(buttonGroup6,2,1);

	layout.setBottom(encoders);
	layout.setLeft(screen);
	layout.setRight(pads);
	//layout.getChildren().add(encoders);
	Scene s = new Scene(layout, 1600,910);
	window.setScene(s);
	window.setTitle("Pulsar");
	window.setResizable(true);
	window.show();
		}
}
