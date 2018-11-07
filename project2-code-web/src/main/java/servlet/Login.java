package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import data.User;
import javax.ejb.EJB;
import ejb.UserEJBRemote;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	@EJB
    private UserEJBRemote authEJB;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
        String email = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");
        session.removeAttribute("error");
        session.removeAttribute("success");

        User user = authEJB.recognizeUser(email,password);

        if(user != null){
            session.setAttribute("emailUser",user.getEmail());
            session.setAttribute("user", user);
            response.sendRedirect(request.getContextPath()+"/home.jsp");

        }else{
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            session.setAttribute("error", "Email or password incorrect");
        }
	}

}
