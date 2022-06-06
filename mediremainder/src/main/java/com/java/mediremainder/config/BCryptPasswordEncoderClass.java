package com.java.mediremainder.config;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BCryptPasswordEncoderClass {

	public String getBCriptEncodedPwd(String pwdString) {
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		String encodedPWD = bpe.encode(pwdString);
		return encodedPWD;
	}
}