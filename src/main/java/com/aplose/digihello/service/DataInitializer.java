package com.aplose.digihello.service;

import com.aplose.digihello.model.UserInfo;
import com.aplose.digihello.repository.UserInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Bean
    public CommandLineRunner initDatabase(UserInfoRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("admin") == null) {
                userRepository.save(new UserInfo(
                        null,
                        "admin",
                        passwordEncoder.encode("admin"), // Encode le mot de passe
                        "ROLE_ADMIN" // Rôle par défaut
                ));
                System.out.println("Default user 'admin' created!");
            }
            if (userRepository.findByUsername("user1") == null) {
                userRepository.save(new UserInfo(
                        null,
                        "user1",
                        passwordEncoder.encode("userpass"), // Mot de passe encodé pour user1
                        "ROLE_USER" // Rôle utilisateur standard
                ));
                System.out.println("Default user created: username=user1, password=userpass");
            }
        };
    }
}
