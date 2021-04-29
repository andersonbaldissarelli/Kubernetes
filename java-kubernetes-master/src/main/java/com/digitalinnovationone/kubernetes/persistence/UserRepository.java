package com.digitalinnovationone.kubernetes.persistence;

import com.digitalinnovationone.kubernetes.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

