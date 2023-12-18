package ru.nsu.ccfit.trushkov.snakes.game;

public interface GameObservable {
    void addObserver(GameObserver gameObserver);

    void removeObserver(GameObserver gameObserver);

    void notifyObservers();
}
