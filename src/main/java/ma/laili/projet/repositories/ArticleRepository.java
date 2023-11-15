package ma.laili.projet.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.laili.projet.entities.Article;
import ma.laili.projet.entities.Categorie;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

	public List<Article> findBetweenDate(Date date1, Date date2, Categorie categorie);
}
