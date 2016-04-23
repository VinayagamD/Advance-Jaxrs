package com.vinay.javatrains.rest;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by vinayagamd on 21/03/16.
 */

@Path("{pathParam}/test")
public class MyResource {

    @PathParam("pathParam") private String pathParamExample;
    @QueryParam("query")  private String queryParamExample;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testMethod(){
        return String.format("It works! Path param used %s and Query Param used %s", pathParamExample, queryParamExample);
    }
}
