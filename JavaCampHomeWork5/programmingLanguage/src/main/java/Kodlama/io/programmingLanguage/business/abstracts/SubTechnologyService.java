package Kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import Kodlama.io.programmingLanguage.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.programmingLanguage.business.requests.subTechnology.DeleteSubTechnologyRequest;
import Kodlama.io.programmingLanguage.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.programmingLanguage.business.responses.subTechnology.GetAllSubTechnologiesResponse;
import Kodlama.io.programmingLanguage.business.responses.subTechnology.GetSubTechnologyResponse;

public interface SubTechnologyService {

	List<GetAllSubTechnologiesResponse> getAll();
	GetSubTechnologyResponse getById(int id);
	GetSubTechnologyResponse findByName(String name);
	void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception;
	void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception;
	void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) throws Exception;
}
