/***********************************************************************
 * Module:  Mutuelle.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Mutuelle
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

/** @pdOid 0a35cc27-2579-427f-b8ce-b7c3011c9ead */
public class Mutuelle {
   /** @pdOid c28ee83d-4df9-4b71-8388-ba2a7ecbdec3 */
   private long id;
   /** @pdOid 439aabb7-2717-49f7-b19c-09530628cdc1 */
   private String nom;
   /** @pdOid db4c92a1-82cc-47d7-9c59-aaa807890e12 */
   private String telephone;
   /** @pdOid dbd2ae28-ccad-4720-9614-6969750ce582 */
   private String mail;
   /** @pdOid c0c7e0ce-142c-4a8b-bc38-de1f6e79451a */
   private String adresse;
   /** @pdOid 6185ace9-a875-4b9f-90c6-6458eddf0b12 */
   private String ville;
   /** @pdOid 9b7fbd71-2283-46ff-9c56-d5d99890e0f1 */
   private String departement;
   /** @pdOid ff7fc075-2a7f-4e4c-9db6-8b6be1d8a541 */
   private String region;
   
   /** @pdRoleInfo migr=no name=Structure assc=mutuelleStructure coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Structure> structure;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Structure> getStructure() {
      if (structure == null)
         structure = new java.util.HashSet<Structure>();
      return structure;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStructure() {
      if (structure == null)
         structure = new java.util.HashSet<Structure>();
      return structure.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStructure */
   public void setStructure(java.util.Collection<Structure> newStructure) {
      removeAllStructure();
      for (java.util.Iterator iter = newStructure.iterator(); iter.hasNext();)
         addStructure((Structure)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStructure */
   public void addStructure(Structure newStructure) {
      if (newStructure == null)
         return;
      if (this.structure == null)
         this.structure = new java.util.HashSet<Structure>();
      if (!this.structure.contains(newStructure))
         this.structure.add(newStructure);
   }
   
   /** @pdGenerated default remove
     * @param oldStructure */
   public void removeStructure(Structure oldStructure) {
      if (oldStructure == null)
         return;
      if (this.structure != null)
         if (this.structure.contains(oldStructure))
            this.structure.remove(oldStructure);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStructure() {
      if (structure != null)
         structure.clear();
   }

}