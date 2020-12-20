package it.unirc.twd.servlet;
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.unirc.twd.beans.Utente;
import it.unirc.twd.beans.UtenteDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UtenteDAO uDAO;
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        Utente utente = new Utente();
        utente.setUsername(username);
        utente.setPassword(password);
        
        if (uDAO.LoginUtente(utente)) {
		    HttpSession session = request.getSession();
		    session.setAttribute("username",username);
		    response.sendRedirect("AreaRiservataUtente.jsp");
		} else {
		    HttpSession session = request.getSession();
		   session.setAttribute("user", username);
		    response.sendRedirect("Login.jsp");
		}
	}

}
