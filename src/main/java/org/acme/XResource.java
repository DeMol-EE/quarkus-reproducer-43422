package org.acme;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;

@Unremovable
@RequestScoped
public class XResource {

    @GET
    public String get() {
        return "x";
    }

}
