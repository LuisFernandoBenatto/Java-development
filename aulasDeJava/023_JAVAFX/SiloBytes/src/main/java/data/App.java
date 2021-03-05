package data;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        try {
            scene = new Scene(loadFXML("menu"), 1368, 700);
        
            Image applicationIcon;
            applicationIcon = new Image(getClass().getResourceAsStream("/icons/silo (3).png"));
            stage.getIcons().add(applicationIcon);

            scene.getStylesheets().add("/styles/Style.css");

            stage.setTitle("Silo Bytes");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
        } catch(IOException e) {
            System.out.println("ERRO!!! " + e);
        }  
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}