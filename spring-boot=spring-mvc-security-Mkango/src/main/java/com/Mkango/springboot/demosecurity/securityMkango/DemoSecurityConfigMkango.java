package com.Mkango.springboot.demosecurity.securityMkango;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfigMkango {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {

        UserDetails Mukul = User.builder()
                .username("Mukul")
                .password("{noop}test123")
                .roles("INSTRUCTOR")
                .build();

        UserDetails Akriti = User.builder()
                .username("Akriti")
                .password("{noop}test123")
                .roles("TRAINEE","MEMBER")
                .build();

        UserDetails Rudri = User.builder()
                .username("Rudri")
                .password("{noop}test123")
                .roles("INSTRUCTOR")
                .build();

        UserDetails Cotton = User.builder()
                .username("Cotton")
                .password("{noop}test123")
                .roles("MEMBER")
                .build();

        UserDetails Disco = User.builder()
                .username("Disco")
                .password("{noop}test123")
                .roles("MEMBER")
                .build();

return new InMemoryUserDetailsManager(Mukul,Akriti,Rudri,Cotton,Disco);

    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(configurer->
                configurer
                        .anyRequest().authenticated()
        )
                .formLogin(form->
                        form
                                .loginPage("/showMyLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()
                        );
        return http.build();
    }

}
