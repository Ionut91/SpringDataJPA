package it.develhope.springJpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Iscrizioni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studenti_id")
    private Studenti studenti;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classi_id")
    private Classi classi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classi getClassi() {
        return classi;
    }

    public void setClassi(Iscrizioni iscrizioni) {
        this.classi = classi;
    }

    public Studenti getStudenti() {
        return studenti;
    }

    public void setStudenti(Studenti studenti) {
        this.studenti = studenti;
    }

}
