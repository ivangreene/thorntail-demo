package sh.ivan.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleEndpoint implements ExampleResource {

	@Override
	public Response doGet() {
		return Response.ok("method doGet invoked").build();
	}
}
