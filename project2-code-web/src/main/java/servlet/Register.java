package servlet;

import ejb.UserEJBRemote;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
    @EJB
	private UserEJBRemote authEJB;
	

    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
        String email = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");
        String firstName = (String) request.getParameter("firstName");
        String lastName = (String) request.getParameter("lastName");
        String creditCardString = (String) request.getParameter("creditCard");
        int creditCard = Integer.parseInt(creditCardString);
        session.removeAttribute("error");
        session.removeAttribute("success");
        System.out.println("CALLING CREATE USER: " + " firstName: " + firstName + " lastName: "+ lastName + "email: " + email + " password: " + password + "credit card: "+ creditCard );
        String result = authEJB.createAccount(firstName, lastName, email, password, creditCard);

        if(result.equals("Success")){
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            session.setAttribute("error", result);
        }
        else{
            response.sendRedirect(request.getContextPath()+"/register.jsp");
            session.setAttribute("error", result);
            System.out.println("Error creating user");
        }

		//doGet(request, response);
	}

}
