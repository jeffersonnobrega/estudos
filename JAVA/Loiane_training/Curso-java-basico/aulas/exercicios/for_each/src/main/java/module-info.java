module com.example.for_each {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.for_each to javafx.fxml;
    exports com.example.for_each;
}