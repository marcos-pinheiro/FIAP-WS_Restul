package br.com.fiap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWeb {

	@WebMethod
	public String hello(String nome) {
		return "Ol� " + nome;
	}
}