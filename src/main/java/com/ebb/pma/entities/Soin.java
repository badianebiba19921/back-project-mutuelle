/***********************************************************************
 * Module:  Soin.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Soin
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** @pdOid 214fa8e3-9f8e-4de9-96a4-cef2572852fe */
public class Soin {
   /** @pdOid 366d69dd-104a-49f1-82db-7f2bb0569636 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   /** @pdOid 55a8b2a4-5e46-4be4-be04-ee7b03df808a */
   private double remboursement;
   
   /** @pdRoleInfo migr=no name=Mutuelle assc=soinMutuelle coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Mutuelle> mutuelle;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Mutuelle> getMutuelle() {
      if (mutuelle == null)
         mutuelle = new java.util.HashSet<Mutuelle>();
      return mutuelle;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMutuelle() {
      if (mutuelle == null)
         mutuelle = new java.util.HashSet<Mutuelle>();
      return mutuelle.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMutuelle */
   public void setMutuelle(java.util.Collection<Mutuelle> newMutuelle) {
      removeAllMutuelle();
      for (java.util.Iterator iter = newMutuelle.iterator(); iter.hasNext();)
         addMutuelle((Mutuelle)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMutuelle */
   public void addMutuelle(Mutuelle newMutuelle) {
      if (newMutuelle == null)
         return;
      if (this.mutuelle == null)
         this.mutuelle = new java.util.HashSet<Mutuelle>();
      if (!this.mutuelle.contains(newMutuelle))
         this.mutuelle.add(newMutuelle);
   }
   
   /** @pdGenerated default remove
     * @param oldMutuelle */
   public void removeMutuelle(Mutuelle oldMutuelle) {
      if (oldMutuelle == null)
         return;
      if (this.mutuelle != null)
         if (this.mutuelle.contains(oldMutuelle))
            this.mutuelle.remove(oldMutuelle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMutuelle() {
      if (mutuelle != null)
         mutuelle.clear();
   }

}