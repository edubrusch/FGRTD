package com.eduardo.FGRTD.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.eduardo.FGRTD.message.StringBean;

@ManagedBean(name = "editor")
public class EditorBean implements Serializable{
	
	@EJB (beanName = "stringy")
	private StringBean stringBean;
	
	private static final long serialVersionUID = 1L;
	private String value = "I do indeed rock";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getMessage() {
		return stringBean.getComplement();
	}
}