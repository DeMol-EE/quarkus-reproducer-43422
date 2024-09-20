package org.acme;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HEAD;

@Unremovable
@RequestScoped
public class ZResource {

    @GET
    public String get() {
        return "z";
    }

    @HEAD
    public void head() {}

}
