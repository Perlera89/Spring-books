package com.Rigoberto.Aplication;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class SpringBooks1Application implements CommandLineRunner{
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	public static void main(String[] args) {
		SpringApplication.run(SpringBooks1Application.class, args);
	}
	
	public void run(String...args) throws Exception {
		String pass1 = "1234";
		String pass2 = "1234";
		
		System.out.println(passEncoder.encode(pass1));
		System.out.println(passEncoder.encode(pass2));
		
		
		
	}
}
