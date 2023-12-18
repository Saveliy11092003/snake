package ru.nsu.ccfit.trushkov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.net.NetNode;
import ru.nsu.ccfit.trushkov.snakes.net.messages.JoinMessage;

public interface JoinMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull JoinMessage joinMsg);
}
