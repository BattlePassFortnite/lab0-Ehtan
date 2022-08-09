package lab0;

import cs15.labs.helloWorldSupport.HelloWorldFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage stage) {
    new HelloWorldFrame(stage);
  }
}
