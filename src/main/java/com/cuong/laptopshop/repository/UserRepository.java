package com.cuong.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cuong.laptopshop.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>
{
    User save(User cuong);
    
}
