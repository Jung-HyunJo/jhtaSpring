package kr.co.jhta.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kakao")
public class KakaoTalkMessageSender implements MessageSender {
	
	@Value("${message.sender.kakao.username}")
	private String username;
	
	@Value("${message.sender.kakao.password}")
	private String password;
	
	@PostConstruct
	public void connect() {
		System.out.println(username +", " + password + "로 카톡서버에 연결됨");
	}
	@PreDestroy
	public void disconnect() {
		
	}
	
	@Override
	public void send(String from, String to, String subject, String content) {
		// TODO Auto-generated method stub
		
	}

	
}
