import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		ServletContext servletContext = getServletContext();
		String contextPath = servletContext.getRealPath(File.separator);
		PrintWriter out = response.getWriter();
		out.println("<br/>File system context path (in TestServlet): " + contextPath);

	}

}