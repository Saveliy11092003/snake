package ru.nsu.ccfit.trushkov.snakes.net;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.game.GameState;
import ru.nsu.ccfit.trushkov.snakes.net.messages.Message;
import ru.nsu.ccfit.trushkov.snakes.net.node.Role;

import java.net.InetSocketAddress;

public interface NodeHandler {

    void changeNodeRole(@NotNull Role nodeRole);

    void changeNodeRole(@NotNull Role nodeRole, GameRecoveryInformation gameState);

    void sendMessage(@NotNull NetNode netNode, @NotNull Message message);

    void updateState(@NotNull GameState gameState);

    void showError(@NotNull String errorMessage);

    void setMaster(@NotNull NetNode sender);

    void lose();

    @NotNull
    NetNode getMaster();

    @NotNull
    InetSocketAddress getMulticastInfo();
}
