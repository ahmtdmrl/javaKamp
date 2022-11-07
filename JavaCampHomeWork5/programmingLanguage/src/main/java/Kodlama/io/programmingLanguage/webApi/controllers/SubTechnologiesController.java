package Kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.programmingLanguage.business.abstracts.SubTechnologyService;
import Kodlama.io.programmingLanguage.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.programmingLanguage.business.requests.subTechnology.DeleteSubTechnologyRequest;
import Kodlama.io.programmingLanguage.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.programmingLanguage.business.responses.subTechnology.GetAllSubTechnologiesResponse;
import Kodlama.io.programmingLanguage.business.responses.subTechnology.GetSubTechnologyResponse;

@RestController
@RequestMapping("/api/subtechnologies")
public class SubTechnologiesController {
	
	
	private SubTechnologyService subTechnologyService;
	
	@Autowired
	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService=subTechnologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllSubTechnologiesResponse> getAll(){
		return this.subTechnologyService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetSubTechnologyResponse getById(@PathVariable int id) {
		return this.subTechnologyService.getById(id);
		
	}
	
	@GetMapping
	public GetSubTechnologyResponse getByName(@RequestParam(name="name") String name) {
		return this.subTechnologyService.findByName(name);
		
	}
	
	@GetMapping("/add")
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception{
		this.subTechnologyService.add(createSubTechnologyRequest);
		
	}
	
	@GetMapping("/update")
	public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception{
		this.subTechnologyService.update(updateSubTechnologyRequest);
		

	}
	
	@GetMapping("/delete")
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) throws Exception{
		this.subTechnologyService.delete(deleteSubTechnologyRequest);
	
	}
	

}
