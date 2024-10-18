package qualquer_um.crime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import qualquer_um.crime.model.Model;
import qualquer_um.crime.repository.Repository;



@RestController
@RequestMapping("crime")

public class Controller {
	
	@Autowired
	Repository repo;
	
	 @PostMapping
	    public ResponseEntity<?> criarCrime(@RequestBody Model crime) {
	       Model novoCrime = new Model(crime);
	    		   repo.save(novoCrime);
	        return ResponseEntity.ok("ok");
	    }
	 
	 @GetMapping
	    public List<Model> listarCrime() {
	        return repo.findAll();
	    }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<Model> buscarCrimePorId(@PathVariable Long id) {
	        return repo.findById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }
}
