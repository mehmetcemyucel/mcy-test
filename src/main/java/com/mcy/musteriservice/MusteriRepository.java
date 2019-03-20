package com.mcy.musteriservice;

public class MusteriRepository {

	public void kaydet(Musteri musteri) {
		System.out.println("Musteri Kaydedildi " + musteri);
	}

	public void sil(Integer musteriId) {
		System.out.println("Musteri silindi " + musteriId);
	}
	
	public Musteri bul(Integer musteriId) {
		System.out.println("Musteri bulundu " + musteriId);
		return null;
	}
}
