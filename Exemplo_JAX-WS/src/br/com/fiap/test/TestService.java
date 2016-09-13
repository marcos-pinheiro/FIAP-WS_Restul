package br.com.fiap.test;

import br.com.fiap.client.HelloWeb;
import br.com.fiap.client.HelloWebService;

public class TestService {
	
	public static void main(String[] args) {
		HelloWeb port = new HelloWebService().getHelloWebPort();
		System.out.println(port.hello("Marcos"));
	}	
}
