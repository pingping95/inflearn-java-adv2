package network.exception.connect;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SoTimeoutServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept(); // 서버는 소켓 연결은 하지만, 아무런 응답을 주지 않음

        Thread.sleep(100000);

    }
}
