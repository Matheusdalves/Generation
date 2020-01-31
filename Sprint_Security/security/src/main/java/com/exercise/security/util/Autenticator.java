package com.exercise.security.util;


import javax.xml.bind.DatatypeConverter;

import com.exercise.security.mode.Usuario;

public class Autenticator {
	private static final String prefix="GeNeRaTiOn|";
	
	public static String encode(Usuario usuario) {
		return DatatypeConverter.printHexBinary((prefix+usuario).getBytes());
	}
	
	public static boolean isValid(String token) {
		byte strByte[] = DatatypeConverter.parseHexBinary(token);
		String newToken = new String(strByte);
		return newToken.startsWith(prefix);	
	}

}
