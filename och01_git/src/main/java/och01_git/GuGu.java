package och01_git;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GuGu
 */
public class GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuGu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int num의 파라미터는 누구를 말한거냐?
		int num	= Integer.parseInt(request.getParameter("num"));
		
		response.setContentType("text/html;charset=utf-8");
		//값을 선택완료가 했을떄 실행을 하려면?
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>구구단"+num+"단</h1>");
		for(int i=1; i<=9; i++) {
			out.printf("%d * %d = %d<br>", num,i,(num*i));
		//	out.println(num+"단 시작 : "+num+"*"+i+"="+num*i);
		}
		out.print("</body></html>");
		out.close();
		//printf와 request.getParameter에 2단 선택하면 2가 담기는중
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
