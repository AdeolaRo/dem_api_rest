package org.example.dem_api_rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello-world")
public class HelloResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Produces("text/plain")
    @Path("/hello-you")
    public String helloYou() {
        return "Hello, You!";
    }

    @GET
    @Produces("application/json")
    @Path("/hello-Json")
    public String helloJson() {
        return "Hello, Json!";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public String json() {
        return "Encore du Json!";
    }

}