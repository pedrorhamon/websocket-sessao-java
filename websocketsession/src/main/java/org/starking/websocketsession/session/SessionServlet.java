package org.starking.websocketsession.session;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * @author pedroRhamon
 */
public class SessionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		Boolean blockUser = Boolean.parseBoolean(req.getParameter("blockUser"));

		HttpSession session = req.getSession();
		session.setAttribute("username", username);
		session.setAttribute("blockUser", blockUser);

		resp.getWriter().write("Usuário " + username + " bloqueado: " + blockUser);
	}

}
