module com.example.hoja11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.hoja11 to javafx.fxml;
    exports com.example.hoja11;
    exports com.example.hoja11.BD;
    opens com.example.hoja11.BD to javafx.fxml;
    exports com.example.hoja11.control;
    opens com.example.hoja11.control to javafx.fxml;
    exports com.example.hoja11.controladores;
    opens com.example.hoja11.controladores to javafx.fxml;
}