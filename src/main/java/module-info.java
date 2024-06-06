module com.example.animatedds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animatedds to javafx.fxml;
    exports com.example.animatedds;
}