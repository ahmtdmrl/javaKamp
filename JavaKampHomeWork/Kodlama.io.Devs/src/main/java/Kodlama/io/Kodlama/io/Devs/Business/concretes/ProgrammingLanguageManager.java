package Kodlama.io.Kodlama.io.Devs.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.Business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service

public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
	this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void create(ProgrammingLanguage programmingLanguage) throws Exception {
		
		if (programmingLanguage.getName() !=null) {
			for(ProgrammingLanguage language:programmingLanguageRepository.getAll()) {
				if(language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				throw new Exception("Aynı isimli programlama dili tekrar edemez");
			}
		}
		programmingLanguageRepository.create(programmingLanguage);
	}
	
	else {
		throw new Exception("Bu alan boş geçilemez");
	}
	}
	

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

	
}
