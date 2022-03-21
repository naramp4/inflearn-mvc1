package hello.servlet.basic.reponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <pre>
 * 수정일              수정자           수정내용
 * ------------------ -------------- -------------------------
 * 2022-03-18 018        RYU            최초 작성
 * <pre>
 *
 * @author naramp4@gmail.com
 * @date 2022-03-18 018
 * @version 1.0.0
 */
@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//[status-line]
		response.setStatus(HttpServletResponse.SC_OK);

		//[response-headers]
		response.setHeader("Content-Type", "text/plain;charset=utf-8");
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("my-header", "hello");

		PrintWriter writer = response.getWriter();
		writer.println("안녕하세요.");
	}
}
