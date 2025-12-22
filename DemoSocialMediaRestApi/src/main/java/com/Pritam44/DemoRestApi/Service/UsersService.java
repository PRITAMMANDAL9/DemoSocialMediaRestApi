package com.Pritam44.DemoRestApi.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.Pritam44.DemoRestApi.entity.User;
@Service
public class UsersService {
	 static List<User> users = new ArrayList<>();
	 static {
		 users.add(new User(1,"pritam",LocalDate.now().minusYears(21)));
		 users.add(new User(2,"ritam",LocalDate.now().minusYears(20)));
		 users.add(new User(3,"pitam",LocalDate.now().minusYears(25)));
		 
	 }
	  public List<User> findall(){
		  return users;
	  }
	  public User findUsers(Integer id){
		  Predicate<? super User> predicate = User -> User.getId().equals(id);
		 return users.stream().filter(predicate).findFirst().orElse(null);
	  }
	  public User saveUser(User user) {
		  users.add(user);
		  return user;
	  }
	  public boolean DeleteUser(Integer id) {
		  Predicate<? super User> predicate = User -> User.getId().equals(id);
		 return users.removeIf(predicate);
	  }

}
