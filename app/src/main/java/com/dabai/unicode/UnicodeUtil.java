package com.dabai.unicode;

public class UnicodeUtil {
	public static String unicodetoString(String unicode){  
		if(unicode==null||"".equals(unicode)){
			return null;
		}
		StringBuilder sb = new StringBuilder();  
		int i = -1;  
		int pos = 0;  
		while((i=unicode.indexOf("\\u", pos)) != -1){  
			sb.append(unicode.substring(pos, i));  
			if(i+5 < unicode.length()){  
				pos = i+6;  
				sb.append((char)Integer.parseInt(unicode.substring(i+2, i+6), 16));  
			}  
		}  
		return sb.toString();  
	} 
	public static String stringtoUnicode(String string) {
		if(string==null||"".equals(string)){
			return null;
		}
		StringBuffer unicode = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			unicode.append("\\u" + Integer.toHexString(c));
		}
		return unicode.toString();
	}
	

}

