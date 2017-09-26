package com.ernesttech.samdemo;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class HelloWorldHandler implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        System.err.println("This is a test log message 1");
        System.err.println("This is a test log message 2");
        return "{ \"Output\": \"Hello World!\"}";
    }
}
