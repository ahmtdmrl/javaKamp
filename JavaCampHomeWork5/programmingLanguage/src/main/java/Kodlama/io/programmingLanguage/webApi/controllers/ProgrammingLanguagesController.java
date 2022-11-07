package Kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.programmingLanguage.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import Kodlama.io.programmingLanguage.business.responses.programmingLanguage.GetProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService=programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return this.programmingLanguageService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetProgrammingLanguageResponse getById(@PathVariable int id) {
		return this.programmingLanguageService.getById(id);
	}
	
	@GetMapping
	public GetProgrammingLanguageResponse getByName(@RequestParam(value="name") String name) {
		return this.programmingLanguageService.findByName(name);
		
	}
	
	@GetMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		this.programmingLanguageService.add(createProgrammingLanguageRequest);
		
	}
	
	@GetMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception{
		this.programmingLanguageService.update(updateProgrammingLanguageRequest);
		
	}
	
	@GetMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception{
		this.programmingLanguageService.delete(deleteProgrammingLanguageRequest);
		
	}
}
