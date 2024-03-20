package org.example;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/rest")
public class HelloController {
    @GET
    @Path("/home")
    public String home(){
        return "index";
    }
}
