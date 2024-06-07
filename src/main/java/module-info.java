module com.example.animatedds {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires junit;
    requires org.junit.jupiter.api;


    opens com.example.animatedds to javafx.fxml;
    exports com.example.animatedds;
}