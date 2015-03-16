package model;
/***********************************************************************
 * Module:  Facture.java
 * Author:  Oussama
 * Purpose: Defines the Class Facture
 ***********************************************************************/
import java.lang.*;
import java.util.*;

public class Facture {
 
   public int numFacture;

   public Date dateFacture;

   public Date datePaiement;

   public int montantFacture;
   
   public Commande cmd;


public void setNumFacture(int numFacture) {
	this.numFacture = numFacture;
}

public void setDateFacture(Date dateFacture) {
	this.dateFacture = dateFacture;
}

public void setDatePaiement(Date datePaiement) {
	this.datePaiement = datePaiement;
}

public void setMontantFacture(int montantFacture) {
	this.montantFacture = montantFacture;
}

public void setCmd(Commande cmd) {
	this.cmd = cmd;
}

}