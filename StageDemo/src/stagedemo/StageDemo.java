package stagedemo;

import static java.lang.System.exit;
import static java.lang.System.out;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StageDemo extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Button btn = new Button("Hello World");
        btn.setOnAction(
                new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event)
            {
                out.println("Hello World");
            }
        }
        );

        Button exitbtn = new Button("Exit");

        exitbtn.setOnAction(
                new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent handle)
            {
                exit(0);
            }
        }
        );

        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(exitbtn);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
