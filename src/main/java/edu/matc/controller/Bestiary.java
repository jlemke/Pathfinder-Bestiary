package edu.matc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.entity.Beast;
import edu.matc.persistence.BeastDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Joe
 */

@Path("/bestiary")
public class Bestiary {

    @GET
    @Path("/name/{name}")
    @Produces("application/json")
    public Response getBeastByName(@PathParam("name") String name) {
        BeastDao dao = new BeastDao();
        Beast beast = dao.getBeast(name);

        ObjectMapper mapper = new ObjectMapper();

        String output = null;
        try {
            output = mapper.writeValueAsString(beast);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return Response.status(200).entity(output).build();
    }

}
