/***********************************************************************
 * Module:  Ordonnance.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Ordonnance
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

/** @pdOid f46f7f11-c1b3-44b9-ae37-cde05f9b753b */
public class Ordonnance {
   /** @pdOid 00b7890f-8a0c-4419-b19a-63a614f28356 */
   private long id;
   /** @pdOid 2773ce2c-4099-4569-9b48-3a6f38af1b22 */
   private double montant;
   /** @pdOid 07b92d49-edd8-49e7-ad3a-b241f10285ac */
   private java.util.Date date;
   /** @pdOid 802494e2-2255-4197-bd94-3ebd3743db88 */
   private String telephone;
   /** @pdOid c64a3380-fc5c-4cd6-b1f8-b7369c1a9435 */
   private String mail;
   
   /** @pdRoleInfo migr=no name=Medicament assc=ordonnanceMedicament coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Medicament> medicament;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Medicament> getMedicament() {
      if (medicament == null)
         medicament = new java.util.HashSet<Medicament>();
      return medicament;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMedicament() {
      if (medicament == null)
         medicament = new java.util.HashSet<Medicament>();
      return medicament.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMedicament */
   public void setMedicament(java.util.Collection<Medicament> newMedicament) {
      removeAllMedicament();
      for (java.util.Iterator iter = newMedicament.iterator(); iter.hasNext();)
         addMedicament((Medicament)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMedicament */
   public void addMedicament(Medicament newMedicament) {
      if (newMedicament == null)
         return;
      if (this.medicament == null)
         this.medicament = new java.util.HashSet<Medicament>();
      if (!this.medicament.contains(newMedicament))
         this.medicament.add(newMedicament);
   }
   
   /** @pdGenerated default remove
     * @param oldMedicament */
   public void removeMedicament(Medicament oldMedicament) {
      if (oldMedicament == null)
         return;
      if (this.medicament != null)
         if (this.medicament.contains(oldMedicament))
            this.medicament.remove(oldMedicament);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMedicament() {
      if (medicament != null)
         medicament.clear();
   }

}