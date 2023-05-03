package yummy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HtmlApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a new WebView
        WebView webView = new WebView();

        // Load the HTML file into the WebView
        webView.getEngine().load(getClass().getResource("index.html").toString());

        // Create a StackPane to hold the WebView
        StackPane root = new StackPane();
        root.getChildren().add(webView);

        // Create a new Scene with the StackPane as the root node
        Scene scene = new Scene(root, 800, 600);

        // Set the Scene on the Stage and show it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
