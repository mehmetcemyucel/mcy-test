package com.mcy.musteriservice;

public class Musteri {

	Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Musteri(Integer id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Musteri [id=" + id + "]";
	}

}
