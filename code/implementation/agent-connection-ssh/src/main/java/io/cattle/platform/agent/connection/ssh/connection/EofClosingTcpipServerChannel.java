package io.cattle.platform.agent.connection.ssh.connection;

import java.io.IOException;
import java.util.concurrent.Executor;

import org.apache.sshd.common.Channel;
import org.apache.sshd.common.NamedFactory;
import org.apache.sshd.common.future.CloseFuture;
import org.apache.sshd.common.future.SshFutureListener;
import org.apache.sshd.common.io.IoSession;

public class EofClosingTcpipServerChannel extends TcpipServerChannel {

    Executor executor;

    public static class EofClosingTcpipServerChannelFactory implements NamedFactory<Channel> {
        @Override
        public String getName() {
            return "forwarded-tcpip";
        }

        @Override
        public Channel create() {
            return new EofClosingTcpipServerChannel(Type.Forwarded);
        }
    }

    public EofClosingTcpipServerChannel(Type type) {
        super(type);
    }

    @Override
    public void handleEof() throws IOException {
        super.handleEof();

        IoSession ioSession = getIoSession();
        if ( ioSession != null ) {
            ioSession.close(true);
        }
    }

}
