package com.example.evalKata.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
	
	List<String> cities = Arrays.asList("Paris","Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", 
			                            "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
	
	public List<String> getCityByString(String city) {
		List<String> list = new ArrayList<>();
		
		if(city.length()>=2) {
			for(String ville: cities){
				if(ville.toLowerCase().startsWith(city.toLowerCase()) || ville.toLowerCase().contains(city.toLowerCase()))
					list.add(ville);
			}
			return list;
		}
		
		if(city.equalsIgnoreCase("*")){
			for(String ville: cities)
				list.add(ville);
			return list;
		}

		return null;
		
	}

}
