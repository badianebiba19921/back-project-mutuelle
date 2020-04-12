/***********************************************************************
 * Module:  Gestionnaire.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Gestionnaire
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

/** @pdOid d5226571-c9c2-41c1-9c07-45bfb08ed49a */
public class Gestionnaire extends Personne {
   /** @pdRoleInfo migr=no name=Mutuelle assc=gestionnaireMutuelle coll=java.util.Collection impl=java.util.HashSet mult=1..* */
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