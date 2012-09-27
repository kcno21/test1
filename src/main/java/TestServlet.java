

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		System.getProperties();
		out.print("java.runtime.name : " + System.getProperty("java.runtime.name")+"</br>");
		out.print("java.vm.version : " + System.getProperty("java.vm.version")+"</br>");
		out.print("java.vm.vendor : " + System.getProperty("java.vm.vendor")+"</br>");
		out.print("os.name : " + System.getProperty("os.name")+"</br>");
		out.print("os.version : " + System.getProperty("os.version")+"</br>");
		out.print("user.dir : " + System.getProperty("user.dir"));
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
