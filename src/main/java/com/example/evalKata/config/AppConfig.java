package com.example.evalKata.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.evalKata.models.City;
import com.example.evalKata.models.ListeDeCity;

@Configuration
public class AppConfig {
	
   @Bean(name = "paris")
   public City paris() {
       return new City("Paris","France");
   }
   
   @Bean(name = "rome")
   public City rome() {
       return new City("Rome","Italie");
   }
   
   @Bean(name = "listeDeCities")
   public ListeDeCity listeDeCities() {
       List<City> listeDeCities = List.of(
               new City("New York", "USA"),
               new City("Sydney", "Australie"),
               new City("Londres", "Angleterre"),
               new City("Hong Kong", "Japon")
       );

       return new ListeDeCity(listeDeCities);
   }


}
