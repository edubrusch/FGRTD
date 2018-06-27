package com.eduardo.FGRTD.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

	private static final long serialVersionUID = 1L;

	public String crudRelatorios() {
		return "relatorios/crudRelatorios";
	}
	
	public String crudTestes() {
		return "analiseTestes/sessoesTeste";
	}	
	
	public String novoRelatorio() {
		return "relatorios/novoRelatorio";
	}
	
	public String editarRelatorio() {
		return "relatorios/editarRelatorio";
	}
	
	

}
