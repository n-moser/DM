/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moser.dm2.logger.DMLogger;
import com.moser.dm2.logger.DMLoggingFactory;

/**
 * LoginServlet
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class LoginServlet extends DMServlet {

    private static final long serialVersionUID = 1L;

    private DMLogger logger = DMLoggingFactory.getLogger(LoginServlet.class);
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {

        String email = rq.getParameter("email");
        String password = rq.getParameter("password");

        if (email == null || password == null) {
            throw new ServletException("Invalid username or password!");
        }

        if (email.equals("admin") && password.equals("aDMin!")) {

            redirect("/app.html", rq, rs);
            return;
        }

        throw new ServletException("Invalid username or password!");
    }

    /**
     * Redirect to the given target location.
     * 
     * @param target
     *            the target location
     * @param request
     *            the servlet request
     * @param response
     *            the servlet response
     * 
     * @throws ClientException
     *             when when the target location is not valid or the redirection fails
     */
    private void redirect(String target, HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        StringBuilder url = new StringBuilder();
        url.append(target);

        try {
            ServletContext servletContext = super.getServletConfig().getServletContext();
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(url.toString());

            if (requestDispatcher == null) {
                this.logger.error("Cannot redirect to '", target, "'. The resource does not exist.");
                throw new ServletException("Cannot redirect to '" + target + "'. The resource does not exist.");
            }

            requestDispatcher.forward(request, response);

        } catch (ServletException se) {
            this.logger.error(se, "Error redirecting to target '", target, "'.");
            throw new ServletException("Error redirecting to target '" + target + "'.", se);
        } catch (Exception e) {
            this.logger.error(e, "Error redirecting to target '", target, "'.");
            throw new ServletException("Error redirecting to target '" + target + "'.", e);
        }
    }

}
