package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage myStage) {
        Button buttonComponent = new Button("My button");
        TextField textFieldComponent = new TextField("This is a line of text.");
        
        FlowPane myFlowPane = new FlowPane();
        myFlowPane.getChildren().add(buttonComponent);
        myFlowPane.getChildren().add(textFieldComponent);
        
        Scene myScene = new Scene(myFlowPane);
        
        myStage.setScene(myScene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
