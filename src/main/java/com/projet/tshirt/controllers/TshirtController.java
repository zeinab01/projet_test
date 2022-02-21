package com.projet.tshirt.controllers;

import org.slf4j.Logger;

import java.util.List;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;
import com.projet.tshirt.models.Tshirt;
import com.projet.tshirt.service.TshirtService;


@RestController
@RequestMapping("/tshirt")
public class TshirtController {
	
	private static final Logger log = LoggerFactory.getLogger(TshirtController.class);


	
    @Autowired
    private TshirtService tshirtService;
    
    
    @GetMapping("/getall")
    public List<Tshirt> getTshirt() {
    	log.info(" OBTENIR LA LISTE DES T-SHIRT ");
			return tshirtService.listeTshirt();
		
    }
    
    
    	
    @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Succes"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
	@GetMapping(value = { "alltshirt" })
	public ResponseEntity<?> findAllTshirt() {
		try {
			return new ResponseEntity<>( tshirtService.listeTshirt() , HttpStatus.OK);	
		}catch (Exception e) {
			log.error("Internal Execpetion : "+e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
    
    
    
    @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Succes"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
    @DeleteMapping(value = "/{id}")
	public ResponseEntity<Tshirt> delete(@PathVariable("id") Integer id) {

		try {
			log.trace("SUPPRESSION D'UN T-SHIRT," + true);
			tshirtService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {

			log.error("ERREUR LORS DE LA SUPPRESSION,{}", e);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}
    
    
    
    @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Succes"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
    @PostMapping("/addTshirt")
    public  ResponseEntity<?> addTshirt(@RequestBody Tshirt tshirt) {
    	log.info(" CREATION D'UN NOUVEAU T-SHIRT "+ tshirt.toString());
    	try {
			return new ResponseEntity<>( tshirtService.create(tshirt) , HttpStatus.OK);	
		}catch (Exception e) {
			log.error("Internal Execpetion : "+e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
		}
    }
    
    
    
    
    @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Succes"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getTshirt(@PathVariable("id") Integer id) {
    	log.info(" OBTENIR UN T-SHIRT "); 
			try {
				return new ResponseEntity<>( tshirtService.readOne(id) , HttpStatus.OK);	
			}catch (Exception e) {
				log.error("Internal Execpetion : "+e.getMessage());
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
			}
		
    }
    
    
    @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Succes"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
    @PutMapping("/updateTshirt/{id}")
    public ResponseEntity<Tshirt> updateTshirt(@RequestBody Tshirt tshirt, @PathVariable("id") Integer id) {
	Tshirt tshirt1 = tshirtService.readOne(id);
	try {

		log.debug("T-SHIRT MODIFIER,{}", tshirt);
			
			tshirt1.getId();
	    	tshirt1.setDate(tshirt.getDate());
	    	tshirt1.getDate();
	       	tshirt1.setMarque(tshirt.getMarque());
	    	tshirt1.getMarque();
	       	tshirt1.setModele(tshirt.getModele());
	    	tshirt1.getModele();
	       	tshirt1.setPrix(tshirt.getPrix());
	    	tshirt1.getPrix();

	    	 tshirtService.update(tshirt);;


			log.debug("TSHIRT MISE A JOUR,{}");

			return new ResponseEntity<>( HttpStatus.CREATED);


	} catch (Exception e) {
		log.error("Internal Execpetion : "+e.getMessage());
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
	}
}
}
