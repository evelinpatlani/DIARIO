module com.example.diario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.diario to javafx.fxml;
    exports com.example.diario;
}