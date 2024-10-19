package com.abdtouirsi.dao;

import java.util.List;

public class EtudiantDAO {
    private List<Etudiant> etudiants = new java.util.ArrayList<>();
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
}
