package ma.laili.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.laili.projet.dao.IDao;
import ma.laili.projet.entities.Categorie;
import ma.laili.projet.repositories.CategorieRepository;

@Service
public class CategorieService  implements IDao<Categorie>{
	
	@Autowired
	private CategorieRepository repository;

	@Override
	public Categorie create(Categorie o) {
		return repository.save(o);
	}

	@Override
	public List<Categorie> findAll() {
		return repository.findAll();
	}

	@Override
	public Categorie update(Categorie o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	public Categorie findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	

}
