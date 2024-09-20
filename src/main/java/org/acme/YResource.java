package org.acme;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.HEAD;

@Unremovable
@RequestScoped
public class YResource {

    @HEAD
    public void head() {}

}
