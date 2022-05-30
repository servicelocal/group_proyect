package com.group2.com.group_proyect.account.model.repository;

import com.group2.com.group_proyect.account.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {



}
