import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;


public class MainApplication extends Application {
    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button1 = new Button("Some Button click!");
        TextArea myTextArea = new TextArea("Some Text");
        myTextArea.setWrapText(true);
        myTextArea.setPrefSize(50, 20);
        StackPane myStackPane = new StackPane(myTextArea, button1);

        Scene myScene = new Scene(myStackPane, 300,400);

        primaryStage.setTitle("Some Title");
        primaryStage.setScene(myScene);
        primaryStage.show();

        clickButtonEvent(button1.getText(), button1, myTextArea);
    }

    private void clickButtonEvent(String text, Button myButton, TextArea myTextArea) {
        myButton.setOnAction((ActionEvent a) -> myTextArea.setText(text));
    }

    private void clickButtonEvent(Stage stage, Button myButton){
        //Equivalent code using an inner class instead of EventHandler.
        myButton.setOnAction((ActionEvent a) -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
                stage.setScene(new Scene(root));
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
