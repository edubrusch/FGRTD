package com.eduardo.test.editor;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String value = "This editor is provided by PrimeFaces";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}