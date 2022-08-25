package warehouse.com.tracking;

import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/order")
public class OrderResource {
    @POST
    void addOrder(){}

    @PATCH
    @Path("/order/{id}/location")
    void addLocation(){}
}
