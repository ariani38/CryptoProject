/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

 

@Entity
@Table(name="crypto")
public class Crypto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCrypto;
    private String name;
    private String acronym;
    private int value;
    private boolean enabled;
	
    public Crypto(int idCrypto, String name, String acronym, int value, boolean enabled) {
		super();
		this.idCrypto = idCrypto;
		this.name = name;
		this.acronym = acronym;
		this.value = value;
		this.enabled = enabled;
		
		
	}

	public Crypto(String name, String acronym, int value, boolean enabled) {
		super();
		this.name = name;
		this.acronym = acronym;
		this.value = value;
		this.enabled = enabled;
	}

	public Crypto() {
		super();
	}

	public int getIdCrypto() {
		return idCrypto;
	}

	public void setIdCrypto(int idCrypto) {
		this.idCrypto = idCrypto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
    
    
    
