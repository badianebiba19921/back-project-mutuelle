/***********************************************************************
 * Module:  Personne.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Personne
 ***********************************************************************/
package com.ebb.pma.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** @pdOid 95d7170e-f413-434b-afd0-789a950aabc8 */
public class Personne {
   /** @pdOid 5f280d7e-2408-422d-88fe-eecb6c4bce05 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   /** @pdOid b6bca80f-9a1b-4371-8dc1-9b0b68ce43a7 */
   private String prenom;
   /** @pdOid d80746d9-dd34-42c0-9709-033a7117bc19 */
   private String nom;
   /** @pdOid 47da2dfa-9826-4267-b568-f0deb1694409 */
   private long cin;
   /** @pdOid e304c875-f37e-42dd-8c8c-cc26fd711707 */
   private String sexe;
   /** @pdOid 3d2c2145-1d08-4a75-a2fb-de039000916d */
   private String adresse;
   /** @pdOid 82eb225f-2fa1-416b-8f15-5cf4734b505d */
   private String mail;
   /** @pdOid 97a24073-38fe-4c0e-bf46-a9b9234ee794 */
   private String login;
   /** @pdOid 9ada8518-4553-4254-b637-2012fda782e0 */
   private String password;
   
   /** @pdRoleInfo migr=no name=Contrat assc=personneContrat coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Contrat> contrat;
   /** @pdRoleInfo migr=no name=Facture assc=personneFacture mult=1..1 */
   public Facture facture;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Contrat> getContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet<Contrat>();
      return contrat;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet<Contrat>();
      return contrat.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContrat */
   public void setContrat(java.util.Collection<Contrat> newContrat) {
      removeAllContrat();
      for (java.util.Iterator iter = newContrat.iterator(); iter.hasNext();)
         addContrat((Contrat)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContrat */
   public void addContrat(Contrat newContrat) {
      if (newContrat == null)
         return;
      if (this.contrat == null)
         this.contrat = new java.util.HashSet<Contrat>();
      if (!this.contrat.contains(newContrat))
         this.contrat.add(newContrat);
   }
   
   /** @pdGenerated default remove
     * @param oldContrat */
   public void removeContrat(Contrat oldContrat) {
      if (oldContrat == null)
         return;
      if (this.contrat != null)
         if (this.contrat.contains(oldContrat))
            this.contrat.remove(oldContrat);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContrat() {
      if (contrat != null)
         contrat.clear();
   }

}