package com.oknoapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oknoapi.rest.host.HostService;
import com.oknoapi.rest.host.fibonacci.FibonacciService;

@RestController
public class OknoController {

	@Autowired
	private HostService hostService;
	
	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "Przetestuj API: <strong>localhost:8080/okno-api/n</strong> ,gdzie n to n-ty wyraz ciągu Fibonacciego";
	}

	@GetMapping(path = "/okno-api/{n}")
	@ResponseBody
	public String helloWorld(@PathVariable int n) {			
		return "Host aplikacji Spring: " + hostService.retrieveInstanceInfo() + "<br>" +
				"N-ta liczba Fibonacciego: " + FibonacciService.calculateFibonacci(n);
	}

	@GetMapping(path = "/okno-api-bean")
	public OknoBean helloWorldBean() {
		return new OknoBean("Test K8");
	}

}
