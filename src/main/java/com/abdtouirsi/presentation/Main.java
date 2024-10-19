package com.abdtouirsi.presentation;

import com.abdtouirsi.dao.Etudiant;
import com.abdtouirsi.dao.EtudiantDAO;
import com.abdtouirsi.metier.EtudiantManager;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager();
        etudiantManager.setEtudiantDAO(etudiantDAO);
        // Ajout de quelques étudiants
        Etudiant etudiant1 = new Etudiant("1", "ABDTOUIRSI", "Nouhaila", "n.abdtouirsi.com");
        Etudiant etudiant2 = new Etudiant("2", "BARKAOUI", "Fadoua", "f.barkaoui.com");
        Etudiant etudiant3 = new Etudiant("3", "RAOUI", "Asmae", "a.raoui.com");
        Etudiant etudiant4 = new Etudiant("4", "ROUDANI", "Med", "m.roudani.com");

        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        // Affichage de tous les étudiants
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }
    }
}