package Kodlama.io.Kodlama.io.Devs.Business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	void create(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);

}
