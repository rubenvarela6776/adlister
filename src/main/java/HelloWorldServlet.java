import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static java.lang.System.out;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;




// url patterns is a set of paths
@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        if (name != null) {
            writer.println("<h1>Hello, " + name + "</h1>");
        } else {
            writer.println("<h1>Hello World</h1>");
        }


        HttpSession session = request.getSession(true);
        int counter = 0;
        Integer ival = (Integer) session.getValue("knownuser");
        if (ival==null) {
            ival = new Integer(1);
            counter++;
            session.putValue("knownuser", ival);
        }

        System.out.println(counter);

        PrintWriter out2 = response.getWriter();
        out2.println(counter);
    }
}
