package com.greenify.ecohub.config;

import org.springframework.context.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.web.*;
import org.springframework.security.web.util.matcher.*;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurity {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // boilerplate code to protect a common hack
        http.csrf(Customizer.withDefaults());
//        http.csrf(csrf -> csrf.disable());


        http.authorizeRequests()
                .requestMatchers(
                        new AntPathRequestMatcher("/admin/**"),
                        new AntPathRequestMatcher("/user/profile")).authenticated()
                .anyRequest().permitAll();

        http.formLogin(formLogin -> formLogin

                .loginPage("/account/login")

                .loginProcessingUrl("/account/loginSubmit")); //after successful login, will take you back to page
        // where you were before


        http.logout(formLogout -> formLogout
                .invalidateHttpSession(true)
                .logoutUrl("/account/logout")
                .logoutSuccessUrl("/"));

        return http.build();
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

}