package com.ahmed.voitures;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmed.voitures.entities.Marque;
import com.ahmed.voitures.entities.Voiture;
import com.ahmed.voitures.repos.VoitureRepository;


@SpringBootTest
class VoituresApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;
	
	@Test
	public void testCreateVoiture() {
	Voiture car = new Voiture("Ford",150.500,new Date());
	voitureRepository.save(car);
	}
	
	@Test
	public void testFindVoiture()
	{
	Voiture v = voitureRepository.findById(1L).get();
	System.out.println(v);
	}
	
	@Test
	public void testUpdateVoiture()
	{
	Voiture v = voitureRepository.findById(1L).get();
	v.setPrixVoiture(200.0);
	voitureRepository.save(v);
	
	System.out.println(v);
	}
	
	@Test
	public void testDeleteVoiture()
	{
		voitureRepository.deleteById(2L);
	}
	
	@Test
	public void testFindAllVoitures()
	{
		List<Voiture> cars = voitureRepository.findAll();
		
		for (Voiture v:cars)
			 System.out.println(v);
		
	}
	
	
	@Test
	public void testFindVoitureByNom()
	{
	List<Voiture> cars = voitureRepository.findByNomVoiture("Ford");
	
	for (Voiture v:cars)
		 System.out.println(v);
	
	}
	
	@Test
	public void testFindVoitureByNomContains()
	{
	List<Voiture> cars = voitureRepository.findByNomVoitureContains("V");
	
	for (Voiture v:cars)
		 System.out.println(v);
	
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Voiture> cars = voitureRepository.findByNomPrix("Ford", 200.0);
		for (Voiture v : cars)
			{
				System.out.println(v);
			}
	}
	
	
	@Test
	public void testfindByMarque()
	{
	Marque mar = new Marque();
	mar.setIdMar(1L);
	
	List<Voiture> cars = voitureRepository.findByMarque(mar);
	for (Voiture p : cars)
	{
		System.out.println(p);
	}
	}
	
	@Test
	public void findByMarqueIdMar()
	{
	List<Voiture> cars = voitureRepository.findByMarqueIdMar(1L);
	for (Voiture p : cars)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomVoitureAsc()
	{
	List<Voiture> cars =  voitureRepository.findByOrderByNomVoitureAsc();
	for (Voiture v : cars)
		{
			System.out.println(v);
		}
	}
	
	@Test
	public void testTrierVoituresNomsPrix()
	{
	List<Voiture> cars = voitureRepository.trierVoituresNomsPrix();
	for (Voiture v : cars)
	{
	System.out.println(v);
	}
	}
	
	
}
