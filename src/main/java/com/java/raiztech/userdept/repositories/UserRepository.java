package com.java.raiztech.userdept.repositories;

import com.java.raiztech.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
