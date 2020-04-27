package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import model.Asiakas;
import model.dao.Dao;

@TestMethodOrder(OrderAnnotation.class)
class JUnit_testaa_asiakkaat {

	@Test
	@Order(1)
	public void testPoistaKaikkiAsiakkaat() {

		Dao dao =  new Dao();
		dao.poistaKaikkiAsiakkaat("cfe3d");
		ArrayList<Asiakas> asiakkaat = dao.listaaKaikki();
		assertEquals(0, asiakkaat.size());
	}
	
	@Test
	@Order(2)
	public void testLisaaAsiakas() {
		Dao dao =  new Dao();
		Asiakas asiakas1 = new Asiakas();
		asiakas1.setEtunimi("Testi");
		asiakas1.setSukunimi( "Testinen");
		asiakas1.setPuhelin("0401234567");
		asiakas1.setSposti("testi@testi.fi");
		
	//	Asiakas asiakas2 = new Asiakas("Testi2", "Testinen", "0401234567","testi@testi.fi");
		//Asiakas asiakas3 = new Asiakas(9997,"Testi3", "Testinen", "0401234567","testi@testi.fi");	
	
		
		
		assertEquals(true, dao.lisaaAsiakas(asiakas1));	
	
		

	}

}
