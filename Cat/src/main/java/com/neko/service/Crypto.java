package com.neko.service;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.security.Key;

public class Crypto {

	 private static final String ALGORITHM = "AES";
	    private static final String KEY = "1Hbfh667adfDEJ78";
	    
	    private static Key generateKey() throws Exception 
	    {
	        Key key = new SecretKeySpec(Crypto.KEY.getBytes(),Crypto.ALGORITHM);
	        return key;
	    }
	    
	    public static String encrypt(String value) throws Exception
	    {
	        Key key = generateKey();
	        Cipher cipher = Cipher.getInstance(Crypto.ALGORITHM);
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
	        String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
	        return encryptedValue64;
	               
	    }
	
	
//	public String crypter(String pass)
//	{
//		String cle ="key";
//        String motdepasse  ="password";
//        BasicTextEncryptor cryptage = new BasicTextEncryptor();
//        //cR97cv5dPKkGcyHpngmyHdxffiahVI+i
//        cryptage.setPassword(motdepasse);
//        return cryptage.encrypt(motdepasse);
//	}
//	
//	public String decrypter (String pass)
//	{
//		 BasicTextEncryptor cryptage = new BasicTextEncryptor();
//		String t = cryptage.decrypt(pass);
//		return t;
//	}
//	
//	public static void main(String[] args) 
//	{
//		Crypto c = new Crypto();
////		// TODO Auto-generated method stub
////		
////		 String myEncryptionPassword ="key";
////         String myDataBasePassword ="password";
////         BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
////
////         //  1 - Cryptage
////         //création d'un Encryptor avec une clé de cryptage
////         textEncryptor.setPassword(myEncryptionPassword);
////         //mon mot de passe avant cryptage
////         System.out.println("Monde passe en clair est : " + myDataBasePassword);                 
////         String myEncryptedPassword = textEncryptor.encrypt(myDataBasePassword);
////         //mon mot de passe après cryptage
////         System.out.println("Monde passe crypté avec la clé : " + myEncryptionPassword+
////                         " est " + myEncryptedPassword);
////
////         //  2 - Décryptage
////         String plainText = textEncryptor.decrypt(myEncryptedPassword);
////         //mon mot de passe après décryptage avec la même clé
////         System.out.println("Aprèsyptage avec la clé : " + myEncryptionPassword+
////                         " on obtient : " + plainText);  
//		System.out.println("blablabla");
//		String s =c.crypter("toto");
//		System.out.println(s);
//		System.out.println("blablabla");
//		String d = c.decrypter(s);
//		System.out.println("blablabla");
//		System.out.println(d);
		


	

}
