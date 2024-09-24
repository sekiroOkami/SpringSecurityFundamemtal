package io.sekiro.ss_c2.config;

import io.sekiro.ss_c2.repository.UserRepository;
import io.sekiro.ss_c2.services.JPAUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ProjectConfig {

//    private final UserRepository userRepository;
//
//    public ProjectConfig(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new JPAUserDetailsService(userRepository);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
