

import java.io.File;

import javafx.application.Application;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class audioPlayer extends Application { //JavaFX applications must extend the application
	
	String path = "/Volumes/Macintosh HD 2/ammarkhan/Desktop/finalflash.mp3";
	File f = new File(path);
	AudioClip audio = new AudioClip(f.toURI().toString());


	
	@Override
	public void start(Stage primaryStage) throws Exception{ //JavaFX applications must have a start() method 
		primaryStage.setTitle("My First JavaFX App");
		
		/* Label label = new Label("Hello World, JavaFX!");
		Scene scene = new Scene (label, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show(); */
		
		
		audio.setCycleCount(2);
		audio.play();

	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
