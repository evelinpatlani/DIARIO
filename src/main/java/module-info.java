module com.example.diario {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.diario to javafx.fxml;
    exports com.example.diario;
}