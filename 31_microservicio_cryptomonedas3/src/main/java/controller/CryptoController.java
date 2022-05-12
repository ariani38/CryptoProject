package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
import model.Crypto;
 
import service.CryptoService;
 

@RestController
public class CryptoController {
	@Autowired
	CryptoService cryptoService;
	@PostMapping(value="SavingCrypto",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void savingCrypto(@RequestBody Crypto crypto) {
		cryptoService.savingCrypto(crypto);
	}
	 
	
	@GetMapping(value="Crypto",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Crypto> criptomonedas(){
		return cryptoService.recoverCryptos();
	}
	
	@GetMapping(value=" /{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Crypto> CriptomonedaNombre(@PathVariable("name") String name){
		return cryptoService.recoverCrypto(name);
	}
	@DeleteMapping(value="Eliminate/{idCrypto}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Crypto> eliminateCrypto(@PathVariable("id") int idCrypto){
		cryptoService.eliminateCrypto(idCrypto);
		return cryptoService.recoverCryptos();
	}
	@GetMapping(value="idCrypto/{name}", produces=MediaType.TEXT_PLAIN_VALUE)
	public String identifyingCrypto(@PathVariable ("name") String name) {
		return cryptoService.idCryptoByName(name)+"";//recordar q al concatenar una cadena vacia se convierte a texto
	}
}
