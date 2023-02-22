package com.example.evalKata.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class City {
	
	String cityName;
	String country;
	
	List<String> cities = Arrays.asList("Paris","Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", 
			                            "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
	
	public City(String cityName, String country) {
		this.cityName = cityName;
		this.country = country;
	}
	
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

	@Override
	public int hashCode() {
		return Objects.hash(cityName, country);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName) && Objects.equals(country, other.country);
	}

}
