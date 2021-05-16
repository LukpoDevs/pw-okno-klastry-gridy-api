package com.oknoapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oknoapi.rest.host.HostService;

@RestController
public class OknoController {

	@Autowired
	private HostService service;

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}

	
	@GetMapping(path = "/okno-api")
	public String helloWorld() {
		return "Host aplikacji Spring: " + service.retrieveInstanceInfo();
	}

	@GetMapping(path = "/okno-api-bean")
	public OknoBean helloWorldBean() {
		return new OknoBean("Test K8");
	}

}
