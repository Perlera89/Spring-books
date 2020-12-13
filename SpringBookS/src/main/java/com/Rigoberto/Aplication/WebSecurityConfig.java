package com.Rigoberto.Aplication;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// Autentificacion de los usuarios al login
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
// Nos servira para recibir las consultas nativas de sql	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
//	trabajar con las autorizaciones de las paginas de los usuarios
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/Inicio","/Contactanos","/Volver a inicio","/Login","/Volver al inicio","/inicio","/contactos","/SingUP","/RegresaInicio"
				,"/INICIO","/CONTACTOS","/SINgup","/Descargando book2","/Regresando al Inicio"
				,"/Regresando Al INICIO","/CONTACTANOs","/SIN gup","/Descargando book3","/Regresando al INicio"
				,"/RegresandoInicio","/ContactaNOS","/SINGUP","/RegresandoINICIO"
				,"/RegresandoAInicio","/Contactandonos","/SING UP","/RegresandoAINICIO","/css/**","/img/**","/libros/**")
		.permitAll()
		.antMatchers("/book1/**","/book2/**","/book3/**","/book4/**","/book5/**").hasAnyAuthority("Manuel")
		.antMatchers("/book1/**","/book2/**","/book3/**","/book4/**","/book5/**").hasAnyRole("Perlera89")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/Login")
		.permitAll()
		.and()
		.logout().permitAll();
		}

	// metodo para el proceso de autentificacion por medio de las consultas
	@Autowired
	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(passEncoder)
		.authoritiesByUsernameQuery("select username, password, enabled from users where username=?")
		.authoritiesByUsernameQuery("select u.username, r.rol from users u, roles r where r.user_id = u.id and u.username=?");
	}


}
