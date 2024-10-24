package com.hibeEclips.HibernateProjectEclips;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String cource_name;
	private String duration;

	public String getCource_name() {
		return cource_name;
	}

	public void setCource_name(String cource_name) {
		this.cource_name = cource_name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Certificate() {
		super();
	}

	public Certificate(String cource_name, String duration) {
		super();
		this.cource_name = cource_name;
		this.duration = duration;
	}

}
