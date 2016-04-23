package com.vinay.javatrains.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by vinayagamd on 21/03/16.
 */

@Path("test3")
public class MyResource3 {


    @GET
    @Produces("text/shortdate")
    public Date testMethod(){
        return Calendar.getInstance().getTime();
    }
}
