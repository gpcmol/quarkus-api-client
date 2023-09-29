package nl.molnet.punk;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.inject.Inject;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.util.List;

@Path("/punk")
public class PunkResource {

  @Inject
  Logger log;

  @RestClient
  private PunkService punkService;

  @GET
  @RunOnVirtualThread
  @Path("/beers")
  public List<Beer> list(@BeanParam PageParameters pageParameters) {
    log.infof("fetch beer list on thread %s", Thread.currentThread());
    return punkService.list(pageParameters);
  }

}
