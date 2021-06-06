package edu.pingpong.quickstart;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Herrero")
public class Herrero  extends PanacheEntityBase {
    @Id
    @Column(unique = true)
    private String nombre;

    @Column
    private String localidad;

    @JsonIgnore
    @OneToMany(mappedBy = "herrero")
    public Set<Espada> espadas = new HashSet<Espada>();

    public Herrero(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public Herrero() {
    }

}
