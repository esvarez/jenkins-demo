package dev.ericksuarez.auth.user.service.service;

import dev.ericksuarez.auth.user.service.service.dto.UserDTO;
import dev.ericksuarez.auth.user.service.service.model.UserEntity;
import dev.ericksuarez.auth.user.service.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }

    public UserEntity save(UserDTO user) {
        UserEntity newUser = UserEntity.builder()
                .username(user.getUsername())
                .password(bcryptEncoder.encode(user.getPassword()))
                .build();
        return userRepository.save(newUser);
    }
}
