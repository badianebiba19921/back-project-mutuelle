/***********************************************************************
 * Module:  Facture.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Facture
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** @pdOid 3969c01f-8013-4cf9-8378-91ac0d76f740 */
@Entity
public class Facture {
   /** @pdOid aaf6bb00-0862-44d4-a60d-dcb02deeb700 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   /** @pdOid 1bafe623-fdd4-4aab-84a3-ad3c339b15e7 */
   private java.util.Date date;
   
   /** @pdRoleInfo migr=no name=Paiement assc=facturePaiement mult=1..1 */
   public Paiement paiement;
   /** @pdRoleInfo migr=no name=Prestation assc=soinPrestation coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Prestation> prestation;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Prestation> getPrestation() {
      if (prestation == null)
         prestation = new java.util.HashSet<Prestation>();
      return prestation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPrestation() {
      if (prestation == null)
         prestation = new java.util.HashSet<Prestation>();
      return prestation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPrestation */
   public void setPrestation(java.util.Collection<Prestation> newPrestation) {
      removeAllPrestation();
      for (java.util.Iterator iter = newPrestation.iterator(); iter.hasNext();)
         addPrestation((Prestation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPrestation */
   public void addPrestation(Prestation newPrestation) {
      if (newPrestation == null)
         return;
      if (this.prestation == null)
         this.prestation = new java.util.HashSet<Prestation>();
      if (!this.prestation.contains(newPrestation))
         this.prestation.add(newPrestation);
   }
   
   /** @pdGenerated default remove
     * @param oldPrestation */
   public void removePrestation(Prestation oldPrestation) {
      if (oldPrestation == null)
         return;
      if (this.prestation != null)
         if (this.prestation.contains(oldPrestation))
            this.prestation.remove(oldPrestation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPrestation() {
      if (prestation != null)
         prestation.clear();
   }

}