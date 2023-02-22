package com.example.evalKata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.example.evalKata.models.City;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EvalKataApplicationTests {
	
	private City city;


	@BeforeAll
    public void setUp() {
		city = new City();
	}
	
	@Test
    public void shouldReturnCityValueAsAPrefixString() {
        assertEquals(Arrays.asList("Valence", "Vancouver"), city.getCityByString("va"));
    }
	
	@Test
    public void shouldReturnCityValueAsContainsString() {
        assertEquals(Arrays.asList("Skopje", "Bangkok", "Hong Kong"), city.getCityByString("ko"));
    }
	
	@Test
    public void shouldReturnAllCitiesValues() {
        assertEquals(Arrays.asList("Paris","Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", 
                "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"), city.getCityByString("*"));
    }
	
	
}
