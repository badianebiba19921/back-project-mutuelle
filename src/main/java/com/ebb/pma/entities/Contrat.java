/***********************************************************************
 * Module:  Contrat.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Contrat
 ***********************************************************************/
package com.ebb.pma.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** @pdOid 90308b44-5273-4616-94a0-cc514325fb6f */
@Entity
public class Contrat {
   /** @pdOid 89331b6d-d701-4b93-a6d1-eafccfa9c373 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   
   /** @pdRoleInfo migr=no name=Mutuelle assc=association10 mult=0..1 */
   public Mutuelle mutuelle;

}