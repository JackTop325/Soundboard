module example.soundboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;


    opens example.soundboard to javafx.fxml;
    exports example.soundboard;
}