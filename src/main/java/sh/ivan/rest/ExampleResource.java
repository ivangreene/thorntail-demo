package sh.ivan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

public interface ExampleResource {
    @GET
    @Produces("text/plain")
    Response doGet();
}
