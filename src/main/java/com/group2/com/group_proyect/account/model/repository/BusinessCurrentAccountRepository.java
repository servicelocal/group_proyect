package com.group2.com.group_proyect.account.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCurrentAccountRepository extends JpaRepository<com.group2.com.group_proyect.account.model.entity.BusinessCurrentAccount, Integer> {
}
