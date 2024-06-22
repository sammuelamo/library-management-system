module com.management.librarymanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.management.librarymanagement to javafx.fxml;
    exports com.management.librarymanagement;
}