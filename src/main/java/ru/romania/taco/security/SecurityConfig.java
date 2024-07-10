package ru.romania.taco.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import ru.romania.taco.data.User;
import ru.romania.taco.data.UserRepository;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // @Bean
    // public UserDetailsService userDetailsService(PasswordEncoder encoder) {
    // List<UserDetails> userdetails = new ArrayList<>();
    // userdetails.add(
    // new User("buzz", encoder.encode("password"), Arrays.asList(new
    // SimpleGrantedAuthority("ROLE_USER"))));
    // return new InMemoryUserDetailsManager(userdetails);
    // }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository) {
        return username -> {
            User user = userRepository.findByUsername(username);
            if (user != null) {
                return user;
            }
            throw new UsernameNotFoundException("User '" + username + "' not found.");
        };
    }
}
