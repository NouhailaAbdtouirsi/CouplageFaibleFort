package com.abdtouirsi.dao;

import java.util.Map;

public class EtudiantDAODictionary {
    private Map<String, Etudiant> etudiants = new java.util.HashMap<>();
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.put(etudiant.getId(), etudiant);
        return etudiant;
    }
    public Map<String, Etudiant> getAllEtudiants() {
        return etudiants;
    }
}
