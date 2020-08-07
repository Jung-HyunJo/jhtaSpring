package kr.co.jhta.di.service.step7;

import java.util.ArrayList;
import java.util.List;

import kr.co.jhta.di.vo.User;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();
		
		User user1 = new User("홍길동", "hong", "010", "sms");
		User user2 = new User("강감찬", "kang", "016", "katalk");
		User user3 = new User("이순신", "lee", "017", "sms");
		User user4 = new User("김원봉", "lee", "017", "katalk");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
	}

}
