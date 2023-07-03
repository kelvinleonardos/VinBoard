module com.example.vinboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.vinboard to javafx.fxml;
    exports com.example.vinboard;
}