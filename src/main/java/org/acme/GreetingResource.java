package org.acme;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.ws.rs.Path;

@Path("hello")
@RequestScoped
public class GreetingResource {

    @Path("x")
    public XResource x() {
        return CDI.current()
                .select(XResource.class)
                .get();
    }

    @Path("y")
    public YResource y() {
        return CDI.current()
                .select(YResource.class)
                .get();
    }

    @Path("z")
    public ZResource z() {
        return CDI.current()
                .select(ZResource.class)
                .get();
    }

}
