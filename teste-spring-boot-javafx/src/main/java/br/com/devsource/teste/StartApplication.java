package br.com.devsource.teste;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@SpringBootApplication
public class StartApplication extends Application implements CommandLineRunner {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(StartApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    StackPane root = root();
    stage.setScene(new Scene(root, 300, 300));
    stage.setTitle("JavaFX 8 app");
    stage.show();
  }

  private StackPane root() {
    StackPane root = new StackPane();
    root.getChildren().add(button());
    return root;
  }

  private Button button() {
    Button btn = new Button(">> Click <<");
    btn.setOnAction(e -> System.out.println("Hello JavaFX 8"));
    return btn;
  }

}
