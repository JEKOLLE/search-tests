package com.example.evalKata.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.evalKata.models.City;
import com.example.evalKata.models.ListeDeCity;

@RestController
@RequestMapping("/main")
public class MainController {
	
	private City paris;
	private ListeDeCity listeDeCities;
	
	public MainController(City paris, ListeDeCity listeDeCities) {
		this.paris = paris;
		this.listeDeCities = listeDeCities;
	}
	
   @GetMapping("/")
   public String getBasicString() {
       return "Basic String here";
   }
   
   @GetMapping("/city")
   public City getCity() {
       return new City("Paris","France");
   }
   
   @GetMapping("/city")
   public List<City> getCities() {
	   return List.of(
			   new City("New York", "USA"),
               new City("Sydney", "Australie"),
               new City("Londres", "Angleterre"),
               new City("Hong Kong", "Japon")
       );   
   }
   
   @GetMapping("/paris")
   public City getParis() {
       return paris;
   }
   
   @GetMapping("/liste-cities")
   public List<City> getListeDeCities() {
       return listeDeCities.getListCities();
   }
   
   @GetMapping("/liste-cities")
   public List<City> getCityFromQuery(@RequestParam("index")Integer index) {
       return listeDeCities.getListCities();
   }
 
}
