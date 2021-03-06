package com.irfaan.microservice.accountservice.db.repository;

import com.irfaan.microservice.accountservice.db.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ahmad Irfaan
 * @date 7/19/2021 10:51 AM
 * microservices-account
 */

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account getFirstByEmail(String email);
}
