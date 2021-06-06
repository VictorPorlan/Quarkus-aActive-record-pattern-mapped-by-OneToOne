package edu.pingpong.quickstart;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/espadas")
public class EspadaResource {

    @Inject
    EspadaService service;

    @GET
    @Path("/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Espada> getEspadaNombre(@PathParam("nombre") String nombre) {
        return service.getEspadaNombre(nombre);
    }

}