package service;

import java.util.Date;
import java.util.List;


import model.Crypto;
 

public interface CryptoService {

	List<Crypto> recoverCryptos();

	List<Crypto> recoverCrypto(String name);

	void savingCrypto(Crypto crypto);
  
	void eliminateCrypto(int idCrypto);

	int idCryptoByName(String name);
 
	
}