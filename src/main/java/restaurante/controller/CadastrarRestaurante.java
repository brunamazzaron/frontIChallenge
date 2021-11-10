package restaurante.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarRestaurante
 */
public class CadastrarRestaurante extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CadastrarRestaurante() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	    System.out.println("METODO GET");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=" + "UTF-8");
	    String name = request.getParameter("name");
	    if(name != null && !name.isEmpty())
	    System.out.println("[RESTAURANTE]" + name);
	    
	    String cnpj = request.getParameter("cnpj");
	    if(cnpj != null && !cnpj.isEmpty())
	    	System.out.println("[RESTAURANTE]" + cnpj);
	    
	    String date = request.getParameter("date");
	    if(date != null && !date.isEmpty())
	    System.out.println("[RESTAURANTE]" + date);
	    
	    
	    System.out.println("METODO POST");

	   
	}

}
