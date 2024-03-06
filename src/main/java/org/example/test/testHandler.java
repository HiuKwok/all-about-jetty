package org.example.test;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.util.Callback;

public class testHandler extends Handler.Wrapper{

    @Override
    public boolean handle(Request request, Response response, Callback callback) throws Exception {

        return super.handle(request, response, callback);
    }

    private class ResponseWrapper extends Response.Wrapper {

        public ResponseWrapper(Request request, Response wrapped) {


            super(request, wrapped);
        }
    }

}
