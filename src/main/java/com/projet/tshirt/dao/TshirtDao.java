package com.projet.tshirt.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.tshirt.models.Tshirt;


public interface TshirtDao extends JpaRepository <Tshirt, Integer>{

	 @Query("SELECT t FROM tshirt t")
	 List<Tshirt> findByListName();
	 
	 @Query("SELECT c FROM tshirt c WHERE c.prix=:prix")
	 List<Tshirt> findGrpeByService(Integer prix);
	 
	 @Query("SELECT g FROM tshirt g WHERE g.marque=:marque")
		public List<Tshirt> listeMarque(String marque);

}
