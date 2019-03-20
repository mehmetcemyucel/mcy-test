package com.mcy.musteriservice;

public class MusteriService {
	MusteriRepository musteriRepository;
	BilgilendirmeService bilgilendirmeService;

	public MusteriService(MusteriRepository musteriRepository, BilgilendirmeService bilgilendirmeService) {
		this.musteriRepository=musteriRepository;
		this.bilgilendirmeService=bilgilendirmeService;
	}
	
	public void musteriKaydet(Musteri musteri) {
		musteriRepository.kaydet(musteri);
		bilgilendirmeService.yeniKayitMailGonder(musteri);
	}
	
	public void musteriSil(Integer musteriId) {
		musteriRepository.sil(musteriId);
	}

}
