/***********************************************************************
 * Module:  Prestation.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Prestation
 ***********************************************************************/
package com.ebb.pma.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private java.util.Date date;
   
   /** @pdRoleInfo migr=no name=Cabinet assc=prestationCabinet mult=1..1 */
   public Cabinet cabinet;

}