package com.LWLG.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LWLG.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
