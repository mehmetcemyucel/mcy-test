package com.mcy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.mcy.musteriservice.BilgilendirmeService;
import com.mcy.musteriservice.Musteri;
import com.mcy.musteriservice.MusteriRepositoryStub;
import com.mcy.musteriservice.MusteriService;

public class MusteriServiceTest {

	BilgilendirmeService bilgilendirmeService;
	MusteriService musteriService;

	// MusteriRepositoryStub musteriRepository=new MusteriRepositoryStub(); //
	// TESTLERIN SIRASI BELIRSIZ OLDUGU ICIN TEHLIKELI

	MusteriRepositoryStub musteriRepository;

	@Before
	public void setUp() {
		musteriRepository = new MusteriRepositoryStub();
		bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
		musteriService = new MusteriService(musteriRepository, bilgilendirmeService);
	}

	@After
	public void after() {
		musteriRepository.getMusteriMap().clear();
	}

	@Test
	public void testKaydet() {
		Musteri musteri = new Musteri(1);
		musteriService.musteriKaydet(musteri);
		Mockito.verify(bilgilendirmeService).yeniKayitMailGonder(musteri);
		assertEquals(musteri, musteriRepository.bul(1));
	}

	@Test
	public void testSil() {
		Musteri musteri = new Musteri(2);
		musteriService.musteriKaydet(musteri);
		musteriRepository.sil(2);
		assertNull(musteriRepository.getMusteriMap().get(2));
	}

}
