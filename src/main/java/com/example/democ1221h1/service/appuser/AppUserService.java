package com.example.democ1221h1.service.appuser;

import com.example.democ1221h1.model.AppUser;
import com.example.democ1221h1.repo.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppUserService implements IAppUserService, UserDetailsService {

    @Autowired
    private IAppUserRepo appUserRepo;

    @Override
    public Iterable<AppUser> findAll() {
        return null;
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public AppUser save(AppUser appUser) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepo.findByName(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(appUser.getAppRole());
        UserDetails userDetails = new User(
                appUser.getName(),
                appUser.getPassword(),
                authorities
        );
        return userDetails;
    }
}
