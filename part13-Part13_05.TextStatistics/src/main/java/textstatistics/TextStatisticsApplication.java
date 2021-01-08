package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        HBox textComponents = new HBox();
        textComponents.setSpacing(10);
        textComponents.getChildren().add(new Label("Letters: 0"));
        textComponents.getChildren().add(new Label("Words: 0"));
        textComponents.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(textComponents);
        layout.setCenter(new TextArea(""));
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
        
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
