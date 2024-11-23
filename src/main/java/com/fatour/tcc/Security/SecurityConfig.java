package com.fatour.tcc.Security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/api/usuarios", "api/usuarios/login", "/api/excursions", "/api/excursions/{id}"
                                        ,"/api/excursions/payments","/api/excursions/payment/{id}","/api/excursions/{usuarioId}/payment"
                                        ,"/api/excursions/{excursionId}/seat", "/api/usuarios/{usuarioId}/seat", "/api/excursions/{excursionId}/seatNumber","/api/usuarios/{usuarioId}/payments", "/api/usuarios/{userId}/payments/{paymentId}/details").permitAll()

                                .anyRequest().authenticated()
                )
                .csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }


    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
