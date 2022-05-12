package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import model.Crypto;
 
 
 

public interface CryptoDao extends JpaRepository<Crypto,Integer>{
	@Query("select c from Crypto c where c.name=?1")
	List<Crypto> findByName(String name);
	
	Crypto findCryptoByName(String name);
}
