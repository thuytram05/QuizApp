package com.ndtt.quizapp;

import com.ndtt.utils.Myalert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        
        Stage stage =new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }
    
    public void handlePractice(ActionEvent event){
        Myalert.getInstance().showMsg("Coming soon...");
    }
    
    public void handleExam(ActionEvent event){
        Myalert.getInstance().showMsg("Coming soon...");
    }

}
