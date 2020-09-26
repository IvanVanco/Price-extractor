package extractor;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    
        @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
        Scene scene = new Scene(root);
        
        //Ikonica
        URL url = getClass().getResource("/extractor/slike/Runescape.png");
        stage.getIcons().add(new Image(url.toURI().toString()));

        scene.getStylesheets().add("/extractor/styles/style.css");
        stage.setScene(scene);
        stage.setTitle("Runescape price extractor");        
        stage.show();
    }  

public static void main(String[] args) {
        launch(args);

    }


    
}
