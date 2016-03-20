package com.vinay.javatrains.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by vinayagamd on 21/03/16.
 */

@Path("test")
@Singleton
public class MyResource {

    private int count;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testMethod(){
        count += 1;
        return String.format("It works! This method was called %d time(s)", count);
    }
}
