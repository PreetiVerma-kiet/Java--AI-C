package com.javaclass.learning.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaclass.learning.entity.Entry;

@RestController
@RequestMapping("/api")
public class EntryController {
	
	// Entry-related endpoints will be defined here in the future
	public Map<Long, Entry> studententries = new HashMap<>();
	
	@GetMapping("/entries")
	public List<Entry> getAllEntries() {
		return new ArrayList<>(studententries.values());
	}
	@PostMapping("/entries")
	public boolean addEntry(@RequestBody Entry entry) {
		studententries.put(entry.getId(), entry);
		return true;
	}
	@GetMapping("/id/{id}")
	public Entry getEntryById(@PathVariable long id) {
		return studententries.get(id);
	}
	@DeleteMapping("/id/{id}")
	public boolean deleteEntryById(@PathVariable long id) {
		studententries.remove(id);
		return true;
	}
	@PutMapping("/id/{id}")
	public boolean updateEntryById(@PathVariable long id, @RequestBody Entry entry) {
		studententries.put(id, entry);
		return true;
	}

}
