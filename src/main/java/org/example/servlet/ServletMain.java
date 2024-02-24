package org.example.servlet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.ee8.nested.ContextHandler;
import org.eclipse.jetty.ee8.nested.Request;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.ee8.servlet.FilterHolder;
import org.eclipse.jetty.ee8.servlet.ServletContextHandler;
import org.eclipse.jetty.ee8.servlet.ServletHolder;
import org.eclipse.jetty.ee8.servlets.CrossOriginFilter;
import org.eclipse.jetty.util.Callback;
import org.example.servlet.ShopCartServlet;

import java.io.IOException;
import java.util.EnumSet;
import java.util.EventListener;

import static org.eclipse.jetty.server.Handler.*;

public class ServletMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Server server = new Server(8080);
        Connector connector = new ServerConnector(server);
        server.addConnector(connector);

// Create a ServletContextHandler with contextPath.
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/shop");
        context.setHandler(new org.eclipse.jetty.ee8.nested.Handler() {
            @Override
            public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
                System.out.println("Hello nested handler!");

            }

            @Override
            public void setServer(Server server) {

            }

            @Override
            public Server getServer() {
                return null;
            }

            @Override
            public void destroy() {

            }

            @Override
            public void start() throws Exception {

            }

            @Override
            public void stop() throws Exception {

            }

            @Override
            public boolean isRunning() {
                return false;
            }

            @Override
            public boolean isStarted() {
                return false;
            }

            @Override
            public boolean isStarting() {
                return false;
            }

            @Override
            public boolean isStopping() {
                return false;
            }

            @Override
            public boolean isStopped() {
                return false;
            }

            @Override
            public boolean isFailed() {
                return false;
            }

            @Override
            public boolean addEventListener(EventListener eventListener) {
                return false;
            }

            @Override
            public boolean removeEventListener(EventListener eventListener) {
                return false;
            }
        });
// Link the context to the server.
//        server.setHandler(context);




        // Test handler.
        ContextHandler testHandler = new ContextHandler();
        testHandler.setContextPath("/shop/2");
        testHandler.setHandler(new org.eclipse.jetty.ee8.nested.Handler() {
            @Override
            public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
                System.out.println("Hello nested handler 2 !");

            }

            @Override
            public void setServer(Server server) {

            }

            @Override
            public Server getServer() {
                return null;
            }

            @Override
            public void destroy() {

            }

            @Override
            public void start() throws Exception {

            }

            @Override
            public void stop() throws Exception {

            }

            @Override
            public boolean isRunning() {
                return false;
            }

            @Override
            public boolean isStarted() {
                return false;
            }

            @Override
            public boolean isStarting() {
                return false;
            }

            @Override
            public boolean isStopping() {
                return false;
            }

            @Override
            public boolean isStopped() {
                return false;
            }

            @Override
            public boolean isFailed() {
                return false;
            }

            @Override
            public boolean addEventListener(EventListener eventListener) {
                return false;
            }

            @Override
            public boolean removeEventListener(EventListener eventListener) {
                return false;
            }
        });
//        server.setHandler(testHandler);






// Add the Servlet implementing the cart functionality to the context.
        ServletHolder servletHolder = context.addServlet(ShopCartServlet.class, "/cart/*");
// Configure the Servlet with init-parameters.
        servletHolder.setInitParameter("maxItems", "128");

// Add the CrossOriginFilter to protect from CSRF attacks.
        FilterHolder filterHolder = context.addFilter(CrossOriginFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));
// Configure the filter.
        filterHolder.setAsyncSupported(true);

        server.start();
    }


}