package com.projet.tshirt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.projet.tshirt.dao.TshirtDao;
import com.projet.tshirt.models.Tshirt;

//@Component
public class DemoProperty {

	@Autowired
	private TshirtService tshirtservice;
  
 // @Bean
  public void initialize() {
	  Tshirt t = new Tshirt();
	  t.setModele("tshirt");
	  t.setMarque("adidas");
	  t.setPrix(123);
	  
	  tshirtservice.create(t);
	  
  }

}
