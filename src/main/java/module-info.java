module fr.tp.projettp {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens fr.tp.projettp to javafx.fxml;
    exports fr.tp.projettp;
    exports fr.tp.projettp.Tests;
}