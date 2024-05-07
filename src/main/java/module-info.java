module ru.ixsys.freight {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.jfoenix;
    requires java.sql;
    requires java.sql.rowset;

    opens ru.ixsys.freight to javafx.fxml;
    exports ru.ixsys.freight;
    exports ru.ixsys.freight.controller;
    opens ru.ixsys.freight.controller to javafx.fxml;
//    opens ru.ixsys.freight.controller to javafx.fxml;
//    exports ru.ixsys.freight.controller;
}