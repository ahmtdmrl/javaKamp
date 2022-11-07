package Kodlama.io.programmingLanguage.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.programmingLanguage.entities.ProgrammingLanguage;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{

	ProgrammingLanguage findByName(String name);
}
