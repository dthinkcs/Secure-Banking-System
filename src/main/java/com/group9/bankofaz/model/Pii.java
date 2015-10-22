package com.group9.bankofaz.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

/**
 * @author Chandrani Mukherjee
 *
 */

@Entity
@Table(name = "pii")
@DynamicUpdate
@SelectBeforeUpdate 
public class Pii implements Serializable{
	
	private static final long serialVersionUID = 310779046388655840L;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ssn")
	private ExternalUser ssn;
	
	@Column(name = "visastatus", nullable = false)
	private String visastatus;

	public ExternalUser getSsn() {
		return ssn;
	}

	public void setSsn(ExternalUser ssn) {
		this.ssn = ssn;
	}

	public String getVisastatus() {
		return visastatus;
	}

	public void setVisastatus(String visastatus) {
		this.visastatus = visastatus;
	}
}
