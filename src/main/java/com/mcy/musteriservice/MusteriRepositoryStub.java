package com.mcy.musteriservice;

import java.util.HashMap;
import java.util.Map;

public class MusteriRepositoryStub extends MusteriRepository {

	private Map<Integer, Musteri> musteriMap = new HashMap<Integer, Musteri>();

	public void kaydet(Musteri musteri) {
		super.kaydet(musteri);
		musteriMap.put(musteri.getId(), musteri);
	}

	public void sil(Integer musteriId) {
		super.sil(musteriId);
		musteriMap.remove(musteriId);
	}

	public Map<Integer, Musteri> getMusteriMap() {
		return musteriMap;
	}

	public void setMusteriMap(Map<Integer, Musteri> map) {
		this.musteriMap = map;
	}

	public Musteri bul(Integer musteriId) {
		super.bul(musteriId);
		return musteriMap.get(musteriId);
	}
}
