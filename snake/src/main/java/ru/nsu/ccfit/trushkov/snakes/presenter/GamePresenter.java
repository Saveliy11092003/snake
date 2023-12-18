package ru.nsu.ccfit.trushkov.snakes.presenter;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.presenter.event.UserEvent;


public interface GamePresenter {
    void fireEvent(@NotNull UserEvent userEvent);
}
