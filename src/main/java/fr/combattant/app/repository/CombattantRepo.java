package fr.combattant.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.combattant.app.entity.Combattant;

@Repository
public interface CombattantRepo extends JpaRepository<Combattant, String>{


}
