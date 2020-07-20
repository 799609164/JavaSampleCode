package com.xxx.springboot.second;

import org.springframework.data.repository.CrudRepository;

/**
 * 继承CrudRepository
 */
public interface UserTwoRepository extends CrudRepository<UserTwo, Integer> {

}
