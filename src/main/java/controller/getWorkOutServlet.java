package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CrossfitWorkOut;

/**
 * Servlet implementation class getWorkOutServlet
 */
@WebServlet("/getWorkOutServlet")
public class getWorkOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWorkOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userChoice = request.getParameter("user_choice");
		//System.out.println(userChoice);
		
		CrossfitWorkOut userWorkOut = new CrossfitWorkOut(userChoice);
		
		request.setAttribute("userWorkOut", userWorkOut);
		getServletContext().getRequestDispatcher("/workOutSelectionResults.jsp").forward(request,  response);
		
	}

}
