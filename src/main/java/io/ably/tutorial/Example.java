package io.ably.tutorial;

import io.ably.lib.rest.AblyRest;
import io.ably.lib.types.AblyException;

public class Example {

    private final static String API_KEY = "INSERT-YOUR-API-KEY-HERE"; /* Sign up at ably.io to get your API key */

    /* RuntimeException will be thrown if API_KEY will not be set to a proper one */
    static {
        if (API_KEY.contains("INSERT")) {
            throw new RuntimeException("API key is not set, sign up at ably.io to get yours");
        }
    }

    private AblyRest ablyRest;

    public Example() {
        try {
            initAbly();
        } catch (AblyException e) {
            e.printStackTrace();
        }
    }

    /* Add AblyException to method signature as AblyRest constructor can throw one */
    private void initAbly() throws AblyException {
        ablyRest = new AblyRest(API_KEY);
    }
}