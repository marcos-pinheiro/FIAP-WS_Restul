package br.com.fiap;

import javax.xml.ws.Endpoint;

/* 
 * Generate WS via JAX-WS
 * "C:\Program Files\Java\jdk1.8.0_66\bin\wsgen" -s . -classpath . br.com.fiap.HelloWeb
 * 
 * Generate client via JAX-WS
 * "C:\Program Files\Java\jdk1.8.0_66\bin\wsimport" -keep -p br.com.fiap.client http://localhost:8080/hello?wsdl
 */

public class WSService {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/hello", new HelloWeb());
	}
}