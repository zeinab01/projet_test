package com.projet.tshirt.service;

import java.util.List;
import com.projet.tshirt.models.Tshirt;

public interface TshirtService {

		public List<Tshirt> listeTshirt();
				
		public List<Tshirt> listeMarque(String marque);
		
		public Tshirt readOne(Integer id);
		
		public Tshirt create(Tshirt tshirt);
		
		public Tshirt update(Tshirt tshirt);
		
		public Boolean delete(Integer id);
		
	    List<Tshirt> findByListName(String modele);
	 
	    List<Tshirt> findGrpeByService(Integer prix);
	 

		
}
