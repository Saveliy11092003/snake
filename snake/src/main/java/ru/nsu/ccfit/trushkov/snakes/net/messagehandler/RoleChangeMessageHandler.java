package ru.nsu.ccfit.trushkov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.net.NetNode;
import ru.nsu.ccfit.trushkov.snakes.net.messages.RoleChangeMessage;

public interface RoleChangeMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull RoleChangeMessage roleChangeMsg);
}
