package Kodlama.io.programmingLanguage.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.programmingLanguage.entities.SubTechnology;

@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>{

	SubTechnology findByName(String name);
}
