package Kodlama.io.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import Kodlama.io.programmingLanguage.business.responses.programmingLanguage.GetProgrammingLanguageResponse;
import Kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.programmingLanguage.entities.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements  ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository=programmingLanguageRepository;
		
	}
	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		List<ProgrammingLanguage> programmingLanguages=this.programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse=new ArrayList<>();
		for(ProgrammingLanguage programmingLanguage:programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem=new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			programmingLanguagesResponse.add(responseItem);
		}
		return programmingLanguagesResponse;
	}
	@Override
	public GetProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage=this.programmingLanguageRepository.findById(id).get();
		GetProgrammingLanguageResponse getProgrammingLanguageResponse=new GetProgrammingLanguageResponse();
		getProgrammingLanguageResponse.setId(programmingLanguage.getId());
		getProgrammingLanguageResponse.setName(programmingLanguage.getName());
		
		return getProgrammingLanguageResponse;
		
		
	}
	@Override
	public GetProgrammingLanguageResponse findByName(String name) {
		ProgrammingLanguage programmingLanguage=this.programmingLanguageRepository.findByName(name);
		GetProgrammingLanguageResponse getProgrammingLanguageResponse=new GetProgrammingLanguageResponse();
		getProgrammingLanguageResponse.setId(programmingLanguage.getId());
		getProgrammingLanguageResponse.setName(programmingLanguage.getName());
		
		return getProgrammingLanguageResponse;
	}
	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		if(createProgrammingLanguageRequest.getName()==null) {
			throw new Exception("Lütfen bir programlama dili giriniz:");
		}else if(this.checkIfProgrammingLanguage(createProgrammingLanguageRequest.getName())) {
			throw new Exception("Bu programlama dili zaten var!");
		}
		else {
			ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
			programmingLanguage.setName(createProgrammingLanguageRequest.getName());
			this.programmingLanguageRepository.save(programmingLanguage);
		}
	}
	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
		if(updateProgrammingLanguageRequest.getName()==null) {
			throw new Exception("Lütfen bir programlama dili giriniz:");
		}else {
			ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
			programmingLanguage.setId(updateProgrammingLanguageRequest.getId());
			programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
			this.programmingLanguageRepository.save(programmingLanguage);
			
		}
	}
	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		this.programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());
		
	}
	
	private boolean checkIfProgrammingLanguage(String name) {
		if(this.programmingLanguageRepository.findByName(name)==null) {
			return false;
	}
		return true;
		
	}
}
