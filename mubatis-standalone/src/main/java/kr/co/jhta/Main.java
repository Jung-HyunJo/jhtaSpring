package kr.co.jhta;

import java.util.List;

import kr.co.jhta.dao.UserDao;
import kr.co.jhta.vo.User;

public class Main {

	public static void main(String[] args) {
	
		UserDao userDao = new UserDao();
		
//		System.out.println("새 사용자 등록하기");
//		User user1 = new User("hong4", "홍길삼", "zxcv1234", "hong3@gmail.com");
//		userDao.insertUser(user1);
//		System.out.println("새 사용자 등록이 완료되었습니다.");
		
		System.out.println("모든 사용자 조회하기");
		List<User> users1 = userDao.getAllUsers();
		for(User user : users1) {
			System.out.println(user.getId() + ", " + user.getName());
		}
		System.out.println();
		
		System.out.println("특정 아이디의 사용자 조회하기");
		User user2 = userDao.getUserById("hong3");
		System.out.println(user2);
		if(user2 != null){
			System.out.println(user2.getId() + ", " + user2.getName() +", " + user2.getEmail());
		}else {
			System.out.println("지정된 아이디의 사용자정보가 존재하지 않습니다.");
			
		}
		
		System.out.println("전체 사용자 수 조회하기");
		int usersCount = userDao.getUsersCount();
		System.out.println("전체 사용자 수" + usersCount);
		System.out.println();
		
		
		System.out.println("특정 이름으로 사용자 조회하기");
		List<User> user3 = userDao.getUsersByName("홍길삼");
		System.out.println(user3);
		for(User user : user3) {
			System.out.println(user.getId() + ", " + user.getName() + ", " +user.getEmail());
		}
		
		System.out.println("특정 이메일로 사용자 조회하기");
		User user4 = userDao.getUserByEmail("hong3@gmail.com");
		System.out.println(user4);
		if(user4 != null) {
			System.out.println(user4.getId() + ", " + user4.getName() + ", " + user4.getEmail());
		}else {
			System.out.println("지정된 이메일의 사용자정보가 없습니다.");
		}
		
		
		System.out.println("특정아이디로 사용자 삭제");
		userDao.deleteUerById("hong3");
		
		System.out.println("사용자 정보 전체 삭제");
		//userDao.deletedAllUser();
		
		
		System.out.println("유저 정보 변경");
		User user = new User("hong4", "홍길동", "7777", "hong4@naver.com");
		userDao.updateUser(user);
		
	
	}
	
		
	
		
		
	
}
