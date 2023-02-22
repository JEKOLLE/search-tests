package com.example.evalKata.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.example.evalKata.models.City;
import com.example.evalKata.models.ListeDeCity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MainControllerTest {
	
	private final static String BASE_URL = "http://localhost:";

    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    MainController mainController;

    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    private City paris;
    
    @Autowired
    private ListeDeCity listeDeCities;

    @Test
    public void contextLoads() {
        assertNotNull(mainController);
    }
    
    @Test
    public void getBasicStringShouldReturnBasicString() {
        System.out.println("Application is running on port : " + port);
        assertEquals("Basic String here",
                restTemplate.getForObject(BASE_URL + port + "/main/", String.class));
    }

    @Test
    public void getParisShouldReturnParis() {
        System.out.println("Application is running on port : " + port);
        assertEquals(paris,
                restTemplate.getForObject(BASE_URL + port + "/main/paris", City.class));
    }
    @Test
    public void getCitiesShouldReturnCities() {
        System.out.println("Application is running on port : " + port);
        assertEquals(listeDeCities,
                restTemplate.getForObject(BASE_URL + port + "/main/city", ListeDeCity.class));
    }

}
