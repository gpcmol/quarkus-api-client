package nl.molnet.punk;

import jakarta.ws.rs.QueryParam;

public class PageParameters {
    @QueryParam("page")
    Integer page;
    @QueryParam("per_page")
    Integer per_page;
}
