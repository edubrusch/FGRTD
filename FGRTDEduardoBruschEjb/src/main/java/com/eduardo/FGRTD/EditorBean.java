package com.eduardo.FGRTD;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String value = "I do indeed rock";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}