package com.example.democ1221h1.repo;

import com.example.democ1221h1.model.AppRole;
import com.example.democ1221h1.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByName(String name);
}
