package och01_git;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add3 Get방식으로 start가 된다 method를 안적은 경우에만");
		//목표 : 1부터 누적값 전달 request는 서버에 요청하는거 //즉, html에서 input.num에 적은값을 자바로 들여옴
		//int num= request.getParameter("num"); 숫자를 넣었지만 text라서 형변환해주자
		int num	= Integer.parseInt(request.getParameter("num")); 
		//숫자로 형변환 %d가 여기임
		String loc = request.getParameter("loc");//%s => 문자열을 정함
		
		System.out.println("Add3 num의 값을 : "+num);
		int sum =0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("Add3 sum : "+sum);
		
		//한글로 코딩을 하기 위해서 필요한 2가지
		//서버에 한글로 요청한거고
		request.setCharacterEncoding("utf-8");
		//내가 보내는것도 한글로 바꿔주는 부분임
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//printwriter는 Browser에 보여주는 객체 => 사용자에게 알려주는거임. 개발자=>console
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 합계 %s</h1>",num, loc);
		//%d => 숫자인 num을 말함 //num은 위에서 parseInt를 했음//decimal = d
		//%s => 글자를 받는다.
		
		//out.printf("<h4>Loc--> %s</h4>",loc);
		out.println(sum);
		out.println("</body></html>");
		out.close();
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add3 POST방식으로 start가 된다 method를 적어준경우에는");
	}

}
