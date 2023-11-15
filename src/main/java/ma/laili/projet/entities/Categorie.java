package ma.laili.projet.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id; 
	private long nom;
	
	

	
	@ManyToOne
	private Categorie categorieFille;

	public Categorie() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNom() {
		return nom;
	}

	public void setNom(long nom) {
		this.nom = nom;
	}

	public Categorie getCategorieFille() {
		return categorieFille;
	}

	public void setCategorieFille(Categorie categorieFille) {
		this.categorieFille = categorieFille;
	}
	
	
}
