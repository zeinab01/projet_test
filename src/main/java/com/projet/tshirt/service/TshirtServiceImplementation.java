package com.projet.tshirt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.tshirt.dao.TshirtDao;
import com.projet.tshirt.models.Tshirt;

@Service
public class TshirtServiceImplementation implements TshirtService {

	 @Autowired
	private TshirtDao tshirtdao;
	
	
	public TshirtServiceImplementation(TshirtDao tshirtdao) {
		super();
		this.tshirtdao = tshirtdao;
	}


	@Override
	public List<Tshirt> listeTshirt() {
		// TODO Auto-generated method stub
		return tshirtdao.findAll();
	}



	@Override
	public List<Tshirt> listeMarque(String marque) {
		// TODO Auto-generated method stub
		
		return tshirtdao.listeMarque(marque);
	}


	@Override
	public Tshirt readOne(Integer id) {
		// TODO Auto-generated method stub
		//return tshirtdao.getById(id);
		return null;
	}


	@Override
	public Tshirt create(Tshirt tshirt) {
		// TODO Auto-generated method stub
		return tshirtdao.save(tshirt);
	}


	@Override
	public Tshirt update(Tshirt tshirt) {
		// TODO Auto-generated method stub
		
		return tshirtdao.save(tshirt);
	}


	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		tshirtdao.deleteById(id);
		return(true);
	}


	@Override
	public List<Tshirt> findByListName(String modele) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Tshirt> findGrpeByService(Integer prix) {
		// TODO Auto-generated method stub
		return null;
	}




}
