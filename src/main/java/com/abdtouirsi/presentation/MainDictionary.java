package com.abdtouirsi.presentation;

import com.abdtouirsi.dao.Etudiant;
import com.abdtouirsi.dao.EtudiantDAO;
import com.abdtouirsi.dao.EtudiantDAODictionary;
import com.abdtouirsi.metier.EtudiantManager;
import com.abdtouirsi.metier.EtudiantManagerDictionary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainDictionary {
    public static void main(String[] args) {
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
        EtudiantManagerDictionary etudiantManagerDictionary = new EtudiantManagerDictionary();
        etudiantManagerDictionary.setEtudiantDAO(etudiantDAO);
        // Ajout de quelques étudiants
        Etudiant etudiant1 = new Etudiant("1", "ABDTOUIRSI", "Nouhaila", "n.abdtouirsi.com");
        Etudiant etudiant2 = new Etudiant("2", "BARKAOUI", "Fadoua", "f.barkaoui.com");
        Etudiant etudiant3 = new Etudiant("3", "RAOUI", "Asmae", "a.raoui.com");
        Etudiant etudiant4 = new Etudiant("4", "ROUDANI", "Med", "m.roudani.com");

        etudiantManagerDictionary.addEtudiant(etudiant1);
        etudiantManagerDictionary.addEtudiant(etudiant2);
        etudiantManagerDictionary.addEtudiant(etudiant3);
        etudiantManagerDictionary.addEtudiant(etudiant4);

        // Affichage de tous les étudiants
        for (Etudiant etudiant : etudiantManagerDictionary.getAllEtudiants().values()) {
            System.out.println(etudiant);
        }
    }
}