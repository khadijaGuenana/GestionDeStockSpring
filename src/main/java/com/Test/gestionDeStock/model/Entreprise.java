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
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private  String description;
    @Embedded
    private Adresse adresse;

    @Column(name = "codeFiscal")
    private String codeFiscal;
    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;
    @Column(name = "numTel")
    private String numTel;
    @Column(name = "siteweb")
    private String siteweb;
    @OneToMany(mappedBy="entreprise")
    private List<Utilisateur>utilisateurs;

}

