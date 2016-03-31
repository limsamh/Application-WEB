package com.appliweb.Neko_Atsume.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.appliweb.Neko_Atsume.entities.Astuce;
import com.appliweb.Neko_Atsume.entities.Chat;
import com.appliweb.Neko_Atsume.entities.Utilisateur;

public class AstuceServiceTest {
    
	private static ClassPathXmlApplicationContext context;
	private static AstuceService astuceService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context= new ClassPathXmlApplicationContext("application-context.xml");
		astuceService =(AstuceService) context.getBean("astuceService");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testFindAll() {
    List<Astuce> allAstuces= astuceService.findAll();
	assertNotNull(allAstuces);
	assertTrue(allAstuces.size() > 0);
	System.out.println(allAstuces);
	}

	@Test
	public void testFindById() {
		Astuce astuce=astuceService.findById(1);
		assertNotNull(astuce);
		assertEquals(1, (int)astuce.getIdAvis());
		System.out.println(astuce);
	}

	@Test
	public void testSave() {
		Chat chat = null;
		Utilisateur user = null;
		Astuce astuce =new Astuce(chat, user, "testComment", 0);
		assertNotNull(astuce.getIdAvis());
	}

}
