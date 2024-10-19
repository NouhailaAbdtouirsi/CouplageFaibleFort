package com.abdtouirsi.dao;

public class Etudiant {
    private String id;
    private String nom;
    private String prenom;
    private String email;

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public Etudiant(String id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
