package com.euris.firstecommerceplatform.repositories;

import com.euris.firstecommerceplatform.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
