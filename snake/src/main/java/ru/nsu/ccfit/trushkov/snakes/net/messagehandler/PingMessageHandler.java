package ru.nsu.ccfit.trushkov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.net.NetNode;
import ru.nsu.ccfit.trushkov.snakes.net.messages.PingMessage;

public interface PingMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull PingMessage pingMessageHandler);
}
