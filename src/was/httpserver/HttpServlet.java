package was.httpserver;

import java.io.IOException;

public interface HttpServlet {
    // Servlet : HTTP, Server, Applet의 줄임말 (HTTP 서버에서 실행되는 작은 자바 프로그램)
    // HttpRequest를 통해 HTTP 정보를 꺼내고 HttpResponse를 통해 필요한 응답을 할 수 있도록 한다.
    void service(HttpRequest request, HttpResponse response) throws IOException;
}
