package org.example.test;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.ee9.nested.Handler;
import org.eclipse.jetty.ee9.nested.Request;
import org.eclipse.jetty.server.Server;

import java.io.IOException;
import java.util.EventListener;

public class ee9Handler implements Handler {

    @Override
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {

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
}
