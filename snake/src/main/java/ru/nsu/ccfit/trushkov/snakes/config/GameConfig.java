package ru.nsu.ccfit.trushkov.snakes.config;

public interface GameConfig {

    int getFieldWidth();

    int getFieldHeight();

    int getFoodStaticNumber();

    int getFoodPerPlayer();

    double getProbabilityOfDeadSnakeCellsToFood();
}
