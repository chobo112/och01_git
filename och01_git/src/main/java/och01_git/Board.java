package och01_git;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		Date date = new Date();//util에 있는 date를 해야할듯
		
		String content = request.getParameter("content");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//out.println("<html><body>");
		//out.println("입력한 제목"+title);
		//out.println("입력한 작성자"+writer);
		//out.println("입력한 내용"+content);
		out.println("<html><body><h1>게시판</h1>");
		out.printf("<p>입력한 제목 : %s</p>",title);
		out.printf("<p>입력한 작성자 : %s</p>",writer);
		out.print("작성일 : "+date+"<p>");
		out.printf("<p>입력한 내용 : %s</p>",content);
		//out.printf("<table> 입력한 제목 : %s <br><br> 입력한 작성자 : %s <br><br> 입력한 내용 : %s <table>",title, writer,content);
		//out.println("</html></body>");
	}

}
