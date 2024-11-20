package es.ieslosmontecillos.democontroller;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();
        VBox vb=new VBox();
        Label etiqueta=new Label("probando");

        MiControl micontrol=new MiControl();
        micontrol.setOnAction(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("se ha cliclado en la region");
                etiqueta.setText("cambio provocado por el evento");
            }
        });
        vb.getChildren().addAll(micontrol,etiqueta);
        root.getChildren().add(vb);


        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}