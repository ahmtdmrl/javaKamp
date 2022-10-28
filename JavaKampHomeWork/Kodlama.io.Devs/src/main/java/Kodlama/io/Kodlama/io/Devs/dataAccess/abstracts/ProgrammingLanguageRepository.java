package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	void create (ProgrammingLanguage programmingLanguage);
	void update (ProgrammingLanguage programmingLanguage);
	void delete (int id);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	
}
