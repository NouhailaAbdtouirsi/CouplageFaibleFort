package com.abdtouirsi.metier;

import com.abdtouirsi.dao.Etudiant;
import com.abdtouirsi.dao.EtudiantDAODictionary;

import java.util.List;
import java.util.Map;

public class EtudiantManagerDictionary {
    public EtudiantDAODictionary etudiantDAO;
    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant etudiant1 : etudiantDAO.getAllEtudiants().values()) {

            if (etudiant1.getEmail().equals(etudiant.getEmail()) ) {
                throw new RuntimeException("Email already exists");
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }
    public Map<String, Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
    public void setEtudiantDAO(EtudiantDAODictionary etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }
}
