package controllers;

import models.LoginBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Roma on 08.09.2016.
 */
@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String login = request.getParameter("userLogin");
        String password = request.getParameter("userPassword");

        LoginBean bean = new LoginBean();
        bean.setLogin(login);
        bean.setPassword(password);

        if (bean.validate()){
            request.setAttribute("bean", bean);
            request.getRequestDispatcher("views/loginSuccess.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("views/loginError.jsp").forward(request, response);
        }
    }

}
