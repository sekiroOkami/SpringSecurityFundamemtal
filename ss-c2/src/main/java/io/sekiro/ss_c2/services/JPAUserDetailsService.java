package io.sekiro.ss_c2.services;


import io.sekiro.ss_c2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JPAUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JPAUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var userEntity = userRepository.findUserByUsername(username).orElseThrow(
                ()-> new UsernameNotFoundException("Username not found!.")
        );

        return new SecurityUser(userEntity);
    }
}
