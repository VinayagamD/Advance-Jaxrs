package com.vinay.javatrains.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Vinay on 05-04-2016.
 */

@Path("date/{dateString}")
public class DateResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRequestedDate(@PathParam("dateString")MyDate myDate){

        return String.format("Got %s", myDate.toString());

    }


}
