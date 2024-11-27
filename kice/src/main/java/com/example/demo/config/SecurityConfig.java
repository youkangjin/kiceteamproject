package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // 비밀번호 암호화를 위한 Bean
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // AuthenticationManager Bean
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    // Spring Security 필터 체인 설정
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests()
                .requestMatchers("/css/**", "/js/**", "/images/**", "/login").permitAll() // 정적 리소스 및 로그인 페이지 허용
                .requestMatchers("/admin/**").hasRole("ADMIN") // ADMIN 권한이 필요한 URL
                .anyRequest().authenticated() // 그 외 모든 요청 인증 필요
            .and()
            .formLogin()
                .loginPage("/login") // 사용자 정의 로그인 페이지
                .defaultSuccessUrl("/dashboard", true) // 로그인 성공 후 대시보드로 이동
                .permitAll()
            .and()
            .logout()
                .logoutUrl("/logout") // 로그아웃 URL
                .logoutSuccessUrl("/login") // 로그아웃 후 로그인 페이지로 이동
                .permitAll()
            .and()
            .exceptionHandling()
                .accessDeniedPage("/403"); // 권한 없는 접근 시 403 에러 페이지 설정

        return http.build();
    }
}
