package com.devsuperior.crudwork.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudwork.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ana Clara", "123.456.789-00", 1000.0,Instant.parse("2017-12-25T20:30:50Z"), 2));
		list.add(new Client(2L, "Humberto Gebrim", "123.456.789-00", 1000.0,Instant.parse("2017-12-25T20:30:50Z"), 2));
		list.add(new Client(3L, "Peres Julião", "123.456.789-00", 1000.0,Instant.parse("2017-12-25T20:30:50Z"), 2));
		list.add(new Client(4L, "Isabella Rodrigues", "123.456.789-00", 1000.0,Instant.parse("2017-12-25T20:30:50Z"), 2));
		list.add(new Client(5L, "Pedro Xavier", "123.456.789-00", 1000.0,Instant.parse("2017-12-25T20:30:50Z"), 2));
		list.add(new Client(6L, "Marcela de Lima", "123.456.789-00", 1000.0,Instant.parse("2017-12-25T20:30:50Z"), 2));
		return ResponseEntity.ok().body(list);
	}

}
