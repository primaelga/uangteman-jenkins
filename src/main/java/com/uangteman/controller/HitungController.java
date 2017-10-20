package com.uangteman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.service.HitungService;

@RestController
@RequestMapping("/hitung")
public class HitungController {
	@Autowired
	private HitungService hitungService;
	
	@RequestMapping(method=RequestMethod.GET, value="/add/{a}/{b}")
	public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return hitungService.add(a, b);
	}	
}
