package model;
/***********************************************************************
 * Module:  Client.java
 * Author:  Oussama
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid 79bdebb0-0947-4fbb-beab-1fbdb4dbe00f */
public class Client {
   /** @pdOid 9457656b-dfce-4859-b993-d62f09553437 */
   public  int numClient;
   /** @pdOid 9347f32f-7619-432f-87b0-603896c43f1f */
   public  String nomClient;
   /** @pdOid 17445b17-a8cc-4816-ad13-e713eccded7e */
   public  String prenomClient;
   /** @pdOid 6b0cc42d-c570-4b34-ab52-143aa120eaf8 */
   public  String adresseClient;
   /** @pdOid 3f43fe16-dfa3-47f7-bd5b-363326d8522f */
   public  String telClient;
   /** @pdOid 36aa44e8-3128-410a-bda0-fb511e750347 */
   public  String loginClient;
   /** @pdOid 4ae43b70-7cca-4fc2-9ffd-9ba7747ed58e */
   public  String passClient;
   
   /** @pdRoleInfo migr=no name=Commande assc=passer coll= Collection impl= HashSet mult=1..* side=A */
   public  Collection<Commande> commande;
   
   
   /** @pdGenerated default getter */
   public  Collection<Commande> getCommande() {
      if (commande == null)
         commande = new  HashSet<Commande>();
      return commande;
   }
   
   /** @pdGenerated default iterator getter */
   public  Iterator getIteratorCommande() {
      if (commande == null)
         commande = new  HashSet<Commande>();
      return commande.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommande */
   public void setCommande( Collection<Commande> newCommande) {
      removeAllCommande();
      for ( Iterator iter = newCommande.iterator(); iter.hasNext();)
         addCommande((Commande)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommande */
   public void addCommande(Commande newCommande) {
      if (newCommande == null)
         return;
      if (this.commande == null)
         this.commande = new  HashSet<Commande>();
      if (!this.commande.contains(newCommande))
         this.commande.add(newCommande);
   }
   
   /** @pdGenerated default remove
     * @param oldCommande */
   public void removeCommande(Commande oldCommande) {
      if (oldCommande == null)
         return;
      if (this.commande != null)
         if (this.commande.contains(oldCommande))
            this.commande.remove(oldCommande);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommande() {
      if (commande != null)
         commande.clear();
   }

}