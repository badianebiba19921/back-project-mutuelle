/***********************************************************************
 * Module:  Structure.java
 * Author:  Elhadji BADIANE
 * Purpose: Defines the Class Structure
 ***********************************************************************/
package com.ebb.pma.entities;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
@Entity
/** @pdOid 6ea342f7-9b0e-4c8a-a2a3-04bd4dd5aaa5 */
public class Structure {
   /** @pdOid 9c42cda1-5943-4395-8329-8e3890f7d594 */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
   /** @pdOid 574beae7-b11e-47e7-abdd-fa6bd4644920 */
   private String nom;
   /** @pdOid 23fb7026-f382-4e9f-8f80-9f0da7608cd4 */
   private String telephone;
   /** @pdOid efedfba6-bccc-49e3-9a39-738b927def8b */
   @Email
   private String mail;
   /** @pdOid 8534a9b4-4ba6-4cc2-8a0c-29ce10e6800b */
   private String adresse;
   /** @pdOid f1c894ab-c797-4724-9319-a6540b8eb35f */
   private String ville;
   /** @pdOid d51181ae-0c3e-44a4-a23d-7696b28a78c4 */
   private String departement;
   /** @pdOid 5ae964e1-a815-4f4d-88be-6645e6293105 */
   private String region;
   /** @pdOid ae697fef-c252-4de9-812c-39b8639ea401 */
   private String pays;

}