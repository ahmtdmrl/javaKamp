package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository //bu sınıf bir data access nesnesidir
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages=new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "JAVA"));
		programmingLanguages.add(new ProgrammingLanguage(2, "PYTHON"));
		programmingLanguages.add(new ProgrammingLanguage(3, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(4, "PHP"));
			
	
	}

	@Override
	public void create(ProgrammingLanguage programmingLanguage) {
		
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		
		for (ProgrammingLanguage language: programmingLanguages) {
			if (language.getId()==programmingLanguage.getId()) {
				language.setName(programmingLanguage.getName());
				
			}
		}
	}

	@Override
	public void delete(int id) {
		
		ProgrammingLanguage language=getById(id);
		programmingLanguages.remove(language);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

				
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		for (ProgrammingLanguage programmingLanguage:programmingLanguages) {
			if (programmingLanguage.getId()==id) {
				return programmingLanguage;
			}
		}
		
		return null;
	}
	

}
