package com.maher.equipe.services;

import com.maher.equipe.entities.Equipe;

import java.util.List;


public interface EquipeServices {
    Equipe saveEquipe(Equipe e);
    Equipe updateEquipe(Equipe e);
    void deleteEquipe(Equipe e);
    void deleteEquipeById(Long id);
    Equipe getEquipe(Long id);
    Iterable <Equipe> getAllEquipe();

    List<Equipe> findByNomclassementEquipe(String nom,int classement);

    List<Equipe> findByLeagueId(Long id);
    List<Equipe>findByNomContains(String nom);
    List<Equipe> findByNom(String nom);
    List<Equipe> findByOrderByNomAsc();
    List<Equipe> trierEquipesNomsClassement();






}
