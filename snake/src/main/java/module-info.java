module ru.nsu.ccfit.trushkov.snakes {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires com.google.protobuf;
    requires annotations;
    requires org.apache.commons.lang3;


    opens ru.nsu.ccfit.trushkov.snakes.gui.controllers to javafx.fxml;
    opens ru.nsu.ccfit.trushkov.snakes.gui.utils to javafx.fxml;
    opens ru.nsu.ccfit.trushkov.snakes.game.player to javafx.fxml;
    exports ru.nsu.ccfit.trushkov.snakes;
    exports ru.nsu.ccfit.trushkov.snakes.gui.controllers;
    exports ru.nsu.ccfit.trushkov.snakes.gui.utils;
    exports ru.nsu.ccfit.trushkov.snakes.game.player;
}