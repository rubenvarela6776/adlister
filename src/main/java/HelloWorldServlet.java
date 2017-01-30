import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;




// url patterns is a set of paths
@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloWorldServlet extends HttpServlet {

    private int counter = 0;

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


        counter +=1;
        response.getWriter().println("The count is: " + counter);
    }
}
