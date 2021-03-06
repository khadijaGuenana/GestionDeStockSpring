package com.Test.gestionDeStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commandefournisseur")
public class CommandeFourniseur extends AbstractEntity {
    @Column(name = "code")
    private String code;
    @Column(name = "datecommande")
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "idfournisseur")
    private Fournisseur fournisseur;
    @OneToMany(mappedBy ="commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;



}
