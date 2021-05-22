package com.proyecto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()); 
		auth.inMemoryAuthentication();
	}
	@Override protected void configure(HttpSecurity http) throws Exception {
		http.cors()
		.and()
		.csrf().disable() //Cross-Site Request Forgery (falsificación de petición en sitios cruzados) 
		.authorizeRequests()
		.anyRequest().authenticated() //For any other request, you do not need aspecific role but still need to be authenticated. 
		.and() 
		.formLogin()//authentication method 
		.and() 
		.httpBasic() //authentication method (allow test postman POST,DELETE,PUT) 
		.and() 
		.logout();//http://localhost:8080/login?logout 
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}