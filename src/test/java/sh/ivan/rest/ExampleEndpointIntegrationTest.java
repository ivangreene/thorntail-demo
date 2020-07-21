package sh.ivan.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import java.net.URI;
import javax.ws.rs.core.Response;

@RunWith(Arquillian.class)
@DefaultDeployment(type = DefaultDeployment.Type.WAR)
public class ExampleEndpointIntegrationTest {
    @Test
    public void shouldStartWebserver() {
        ExampleResource exampleEndpoint = RestClientBuilder.newBuilder()
                .baseUri(URI.create("http://localhost:8080/rest/example"))
                .build(ExampleResource.class);
        Response response = exampleEndpoint.doGet();
        assertThat(response.getStatus()).isEqualTo(200);
    }
}
