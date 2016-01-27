package com.EChallenge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "CLASSE")
public class Classe {
		@Id
	    @Column(name = "classeId")
		private String classeId;
		
		@Column(name = "nom")
		private String nom;
		
		@Column(name = "nbrEtudiants")
		private int nbrEtudiants;
		
		@OneToMany
		@JoinColumn(name="etudiantId")
		@Cascade(CascadeType.ALL)
		private Set<Etudiant> etudiants; 
		
		
		@ManyToOne
		@Cascade(CascadeType.ALL)
		@JoinColumn(name = "etablissementId")
		private Etablissement etablissement;
		
		public String getClasseId() {
			return classeId;
		}
		public void setClasseId(String classeId) {
			this.classeId = classeId;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getNbrEtudiants() {
			return nbrEtudiants;
		}
		public void setNbrEtudiants(int nbrEtudiants) {
			this.nbrEtudiants = nbrEtudiants;
		}
		public Set<Etudiant> getEtudiants() {
			return etudiants;
		}
		public void setEtudiants(Set<Etudiant> etudiants) {
			this.etudiants = etudiants;
		}
		public Etablissement getEtablissement() {
			return etablissement;
		}
		public void setEtablissement(Etablissement etablissement) {
			this.etablissement = etablissement;
		}
    
}
