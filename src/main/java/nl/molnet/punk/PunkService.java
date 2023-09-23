package nl.molnet.punk;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/v2")
@RegisterRestClient
public interface PunkService {

  @GET
  @Path("/beers")
  List<Beer> list(@BeanParam PageParameters paging);

}
