package ru.nsu.ccfit.trushkov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.trushkov.snakes.net.NetNode;
import ru.nsu.ccfit.trushkov.snakes.net.messages.AnnouncementMessage;


public interface AnnouncementMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull AnnouncementMessage announcementMsg);
}
