package com.Pritam44.DemoRestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pritam44.DemoRestApi.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
