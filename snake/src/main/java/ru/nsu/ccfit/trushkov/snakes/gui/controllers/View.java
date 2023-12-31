package ru.nsu.ccfit.trushkov.snakes.gui.controllers;

import javafx.scene.paint.Color;
import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.config.GameConfig;
import ru.nsu.ccfit.trushkov.snakes.game.cell.Point;
import ru.nsu.ccfit.trushkov.snakes.game.player.PlayerWithScore;
import ru.nsu.ccfit.trushkov.snakes.gui.utils.GameInfoWithButton;

import java.util.List;
import java.util.Set;

public interface View {
    void drawFruit(@NotNull Point point);

    void drawEmptyCell(@NotNull Point point);

    void drawSnakePoint(@NotNull Point point, @NotNull Color playerSnakeColor);

    void updateCurrentGameInfo(@NotNull String owner, int gameFieldHeight, int gameFieldWidth, int foodNumber);

    void showUserListInfo(@NotNull List<PlayerWithScore> playerWithScoreList);

    void setConfig(@NotNull GameConfig gameConfig);

    void showGameList(@NotNull Set<GameInfoWithButton> gameInfoWithButtons);
}
