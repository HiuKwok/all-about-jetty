package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Ref: https://www.runoob.com/servlet/servlet-client-request.html
 */
public class RequestHeader extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Get cookies:
        req.getCookies();

        // Get para
        req.getParameterMap();

        // Get header
        req.getHeaderNames();
        // ......


        resp.setStatus(200);
        // Or redirect
        resp.sendRedirect("google.com");


        super.doGet(req, resp);
    }
}
