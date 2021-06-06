package edu.pingpong.quickstart;
import javax.inject.Inject;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@ApplicationScoped
public class EspadaService {

    public Optional<Espada> getEspadaNombre(String nombre){
        return Espada.find("nombre", nombre).firstResultOptional();
    }

}
