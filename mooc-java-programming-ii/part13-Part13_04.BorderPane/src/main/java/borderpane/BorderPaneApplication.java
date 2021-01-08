package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
// import javafx.scene.control.TextField;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage myStage) {
        BorderPane myBorderPane = new BorderPane();
        Label topField = new Label("NORTH");
        Label rightField = new Label("EAST");
        Label bottomField = new Label("SOUTH");
        myBorderPane.setTop(topField);
        myBorderPane.setRight(rightField);
        myBorderPane.setBottom(bottomField);
        
        Scene myScene = new Scene(myBorderPane);
        myStage.setScene(myScene);
        myStage.show();
    }
    
    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
