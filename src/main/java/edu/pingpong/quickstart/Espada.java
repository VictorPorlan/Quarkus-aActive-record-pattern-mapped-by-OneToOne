package edu.pingpong.quickstart;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Espada")
public class Espada  extends PanacheEntityBase {
    @NotBlank
    @Id
    @Column(unique = true)
    private String nombre;
    @Column
    private Float longitud;
    @Column
    private boolean afilada;
    @ManyToOne
    @JoinColumn(name = "herrero_name")
    public Herrero herrero;

    public Espada(String nombre, Float longitud, boolean afilada) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.afilada = afilada;
    }

    public Espada() {
    }

}
