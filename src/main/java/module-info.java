module es.ieslosmontecillos.democontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.democontroller to javafx.fxml;
    exports es.ieslosmontecillos.democontroller;
}