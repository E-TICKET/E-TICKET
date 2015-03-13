package model;
/***********************************************************************
 * Module:  Client.java
 * Author:  Oussama
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;


public class Client {
  
   public  int numClient;
 
   public  String nomClient;

   public  String prenomClient;

   public  String adresseClient;

   public  String telClient;

   public  String loginClient;

   public  String passClient;
   
 
   public  Collection<Commande> commande;
   
   

   public  Collection<Commande> getCommande() {
      if (commande == null)
         commande = new  HashSet<Commande>();
      return commande;
   }
   

   public  Iterator getIteratorCommande() {
      if (commande == null)
         commande = new  HashSet<Commande>();
      return commande.iterator();
   }
   
  
   public void setCommande( Collection<Commande> newCommande) {
      removeAllCommande();
      for ( Iterator iter = newCommande.iterator(); iter.hasNext();)
         addCommande((Commande)iter.next());
   }
   

   public void addCommande(Commande newCommande) {
      if (newCommande == null)
         return;
      if (this.commande == null)
         this.commande = new  HashSet<Commande>();
      if (!this.commande.contains(newCommande))
         this.commande.add(newCommande);
   }
   

   public void removeCommande(Commande oldCommande) {
      if (oldCommande == null)
         return;
      if (this.commande != null)
         if (this.commande.contains(oldCommande))
            this.commande.remove(oldCommande);
   }
   

   public void removeAllCommande() {
      if (commande != null)
         commande.clear();
   }

}