package com.bmbs.wechat.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignUtil {

	private static Logger log = LoggerFactory.getLogger(SignUtil.class);
	private static final String TOKEN = "fushuntang";
	private MessageDigest alga;
	private static final SignUtil instance = new SignUtil();

	public SignUtil() {
		try {
			alga = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage());
		}
	}

	public static SignUtil getInstance() {
		return instance;
	}

	public static boolean checkSignature(String signature, String timestamp,
			String nonce) {
		String[] strArr = new String[] { TOKEN, timestamp, nonce };
		Arrays.sort(strArr);
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(strArr[0]).append(strArr[1]).append(strArr[2]);

		return SignUtil.getInstance().encipher(strBuff.toString())
				.equals(signature) ? true : false;
	}

	public String encipher(String strSrc) {
		String strDes = null;
		byte[] bt = strSrc.getBytes();
		alga.update(bt);
		strDes = byte2hex(alga.digest());
		return strDes;
	}

	public static String byte2hex(byte[] b) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < b.length; i++) {
			tmp = (Integer.toHexString(b[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}
}
