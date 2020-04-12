/***********************************************************************
 * Module:  Pharmacie.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Pharmacie
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

/** @pdOid 935dd9a0-596c-4bf1-bf54-74499fbfb4b1 */
public class Pharmacie extends Structure {
   /** @pdRoleInfo migr=no name=Ordonnance assc=pharmacieOrdonnance coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Ordonnance> ordonnance;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Ordonnance> getOrdonnance() {
      if (ordonnance == null)
         ordonnance = new java.util.HashSet<Ordonnance>();
      return ordonnance;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOrdonnance() {
      if (ordonnance == null)
         ordonnance = new java.util.HashSet<Ordonnance>();
      return ordonnance.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOrdonnance */
   public void setOrdonnance(java.util.Collection<Ordonnance> newOrdonnance) {
      removeAllOrdonnance();
      for (java.util.Iterator iter = newOrdonnance.iterator(); iter.hasNext();)
         addOrdonnance((Ordonnance)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOrdonnance */
   public void addOrdonnance(Ordonnance newOrdonnance) {
      if (newOrdonnance == null)
         return;
      if (this.ordonnance == null)
         this.ordonnance = new java.util.HashSet<Ordonnance>();
      if (!this.ordonnance.contains(newOrdonnance))
         this.ordonnance.add(newOrdonnance);
   }
   
   /** @pdGenerated default remove
     * @param oldOrdonnance */
   public void removeOrdonnance(Ordonnance oldOrdonnance) {
      if (oldOrdonnance == null)
         return;
      if (this.ordonnance != null)
         if (this.ordonnance.contains(oldOrdonnance))
            this.ordonnance.remove(oldOrdonnance);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOrdonnance() {
      if (ordonnance != null)
         ordonnance.clear();
   }

}