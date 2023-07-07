package com.damera.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.damera.binding.Country;

@RestController
public class CountryRestController {

	private HashOperations<String,Integer,Country> opsForHash= null;

	public CountryRestController(RedisTemplate<String, Country> rt) {
		this.opsForHash = rt.opsForHash();
	}
	
	@PostMapping("/save")
	public String addCountry(@RequestBody Country country) {
		opsForHash.put("COUNTRIES", country.getSno(),country);
		return "Country saved";
	}

	@GetMapping("/countries")
	public Collection<Country> getCountries(){
		Map<Integer,Country> entries = opsForHash.entries("COUNTRIES");
		Collection<Country> values = entries.values();
		return values;
	}

	@GetMapping("/country/{sno}")
	public Country getCountryById(@PathVariable Integer sno){
		return  opsForHash.get("COUNTRIES", sno);
	}


	@DeleteMapping("/{id}") 
	public String deleteCountry(@PathVariable("sno") Integer sno) {
		opsForHash.delete("COUNTRIES", sno);
		return "Country deleted"; 
	}


}
