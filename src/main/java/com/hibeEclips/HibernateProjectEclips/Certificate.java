package com.hibeEclips.HibernateProjectEclips;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Certificate {
	private String cource_name;
	@Column(name = "Data")
	@Temporal(TemporalType.TIME)
	private Date issue_date;

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public String getCource_name() {
		return cource_name;
	}

	public void setCource_name(String cource_name) {
		this.cource_name = cource_name;
	}


	public Certificate() {
		super();
	}

	public Certificate(String cource_name, Date issue_date) {
		super();
		this.cource_name = cource_name;
		this.issue_date = issue_date;
	}

}
