package ru.nsu.ccfit.trushkov.snakes.net.messages;

public class PingMessage extends Message {
    public PingMessage() {
        super(MessageType.PING);
    }
}
