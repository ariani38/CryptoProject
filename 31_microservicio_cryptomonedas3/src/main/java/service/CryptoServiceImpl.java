package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CryptoDao;
 
 
import model.Crypto;
 

@Service
public class CryptoServiceImpl implements CryptoService {
	
	@Autowired
	CryptoDao  cryptoDao;
	
	 
	@Override
	public List<Crypto> recoverCryptos() {
		return cryptoDao.findAll();
	}

	@Override
	public List<Crypto> recoverCrypto(String name) {
		return  cryptoDao.findByName(name);
	}

	@Override
	public void savingCrypto( Crypto crypto) {
		cryptoDao.save(crypto);
		
	}

	 

	@Override
	public void eliminateCrypto(int idCrypto) {
		cryptoDao.deleteById(idCrypto);
		
	}

	@Override
	public int idCryptoByName(String name) {
		return cryptoDao.findCryptoByName(name).getIdCrypto();
	}
	
	
	
}
