module com.ndtt.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;

    opens com.ndtt.quizapp to javafx.fxml;
    exports com.ndtt.quizapp;
}
