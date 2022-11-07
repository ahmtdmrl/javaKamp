package Kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import Kodlama.io.programmingLanguage.business.responses.programmingLanguage.GetProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	
	List<GetAllProgrammingLanguagesResponse> getAll();
	GetProgrammingLanguageResponse getById(int id);
	GetProgrammingLanguageResponse findByName(String name);
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception;
	
}
