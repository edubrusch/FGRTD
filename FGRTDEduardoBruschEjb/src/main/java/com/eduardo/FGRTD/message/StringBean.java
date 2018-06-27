package com.eduardo.FGRTD.message;

import javax.ejb.Stateless;

@Stateless(name = "stringy")
public class StringBean {
	
	String bomdia = "nope";
	
	public String getComplement() {
		return bomdia;
	}
	

}
