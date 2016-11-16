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
    @Produces("application/xml")
    public Response getMessage() {

        return Response.status(200).entity(output).build();
    }
}
