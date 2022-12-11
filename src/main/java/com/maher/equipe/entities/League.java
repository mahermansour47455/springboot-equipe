package com.maher.equipe.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

    @OneToMany(mappedBy = "league")
    private List<Equipe> equipes;
    public League() {
        super();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String toString() {
        return "League [nom=" + nom + "]";
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}
