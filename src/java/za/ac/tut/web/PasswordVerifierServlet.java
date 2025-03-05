/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.Exceptions.InvalidPasswordException;
import za.ac.tut.model.PasswordValidator;

/**
 *
 * @author Letap
 */
public class PasswordVerifierServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String password = request.getParameter("password");
        
        // Instantiate the model and perform the business logic
        PasswordValidator pv = new PasswordValidator(password);
        
        String message = pv.validatePassowrd();

        // Attach outcome to request object
        request.setAttribute("message", message);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

}
