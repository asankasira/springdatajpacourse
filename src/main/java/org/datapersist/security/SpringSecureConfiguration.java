package org.datapersist.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity  uncomment this for customized security implementation
public class SpringSecureConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("span")
                .password("abc123")
                .roles("USER")
                .and()
                .withUser("WebAdmin1")
                .password("pass")
                .roles("ADMIN");
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests()
                 .antMatchers("/lang").hasRole("ADMIN")
                 .antMatchers("/filmCategory").hasRole("USER")
                 .antMatchers("/").permitAll()
                 .and().formLogin();
    }
}
