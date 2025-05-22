package network.tcp.v4.v3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV3 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        while (true) {
            Socket socket = serverSocket.accept();
            log("소켓 연결: " + socket);

            // 소켓 연결 까지 진행하고 그 이후에는 별도 쓰레드를 만들어준다.
            SessionV3 session = new SessionV3(socket);
            Thread thread = new Thread(session);
            thread.start();
        }
    }
}