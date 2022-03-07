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
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity {

    @Column(name = "code")
private String code;
    @Column(name = "dateCommande")
private Instant dateCommande;
@ManyToOne
@JoinColumn(name = "idclient")
private Client client;
@OneToMany(mappedBy ="commandeClient") //comme il est ecrit dans LigneCommandeClient.
private List<LigneCommandeClient>ligneCommandeClients;




}
