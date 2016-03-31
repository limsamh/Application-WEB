package com.appliweb.Neko_Atsume.service;
import java.util.List;
import com.appliweb.Neko_Atsume.entities.Astuce;

public interface AstuceService {
 
	List<Astuce> findAll();
	Astuce findById(Integer id);
	void save(Astuce astuce);
	
}
