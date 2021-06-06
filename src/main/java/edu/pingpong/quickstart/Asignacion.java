package edu.pingpong.quickstart;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name="Asignacion")
public class Asignacion extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asignacionId")
    private Long id;

    @OneToOne
    @JoinColumn(name= "espada_nombre")
    private Espada espada;

    @OneToOne
    @JoinColumn(name= "herrero_nombre")
    private Herrero herrero;
    public Asignacion() {
    }

    public Espada getEspada() {
        return espada;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public Herrero getEHerrero() {
        return herrero;
    }

    public void setHerrero(Herrero herrero) {
        this.herrero = herrero;
    }

}
