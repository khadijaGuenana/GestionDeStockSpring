package com.Test.gestionDeStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fourniseur")
public class Fournisseur extends AbstractEntity {
    @Column(name = "nom")
    private String nom;
    @Embedded
    private Adresse adresse;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "photo")
    private String photo;
    @Column(name = "mail")
    private String mail;
    @Column(name = "numtel")
    private String numTel;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFourniseur> commandeFourniseurs;





}
