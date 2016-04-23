package com.vinay.javatrains.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by vinayagamd on 21/03/16.
 */

@Path("test2")
public class MyResource2 {




    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Date testMethod(){
        return Calendar.getInstance().getTime();
    }
}
