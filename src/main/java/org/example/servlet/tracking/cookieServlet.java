package org.example.servlet.tracking;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

public class cookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Cookie construction.
        Cookie name = new Cookie("name",
                URLEncoder.encode(req.getParameter("name"), "UTF-8"));
        Cookie url = new Cookie("url",
                req.getParameter("url"));

        // Expire date.
        name.setMaxAge(60*60*24);
        url.setMaxAge(60*60*24);

        // Append cookies
        resp.addCookie( name );
        resp.addCookie( url );
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
