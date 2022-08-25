package warehouse.com.tracking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/tracking")
public class TrackingResource {
    @GET
    public String trackOrder() {
        return "Hello from RESTEasy Reactive";
    }
}