package org.zeromq.api;

import org.zeromq.jzmq.sockets.SocketBuilder;

public interface Subscribable {
    public SocketBuilder subscrible(byte[] data);
}
