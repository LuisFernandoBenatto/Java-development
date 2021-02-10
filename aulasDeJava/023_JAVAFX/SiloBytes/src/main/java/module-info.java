module data {
    requires javafx.controls;
    requires javafx.fxml;

    opens data to javafx.fxml;
    exports data;
}
