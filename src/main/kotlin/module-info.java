module com.aramlr.focuscoach {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.aramlr.focuscoach to javafx.fxml;
    exports com.aramlr.focuscoach;
}