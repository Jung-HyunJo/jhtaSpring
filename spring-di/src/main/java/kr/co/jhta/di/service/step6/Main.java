package kr.co.jhta.di.service.step6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.service.step7.EventNotificationServiceImpl;

public class Main {

	public static void main(String[] args) {
		String conf =  "kr/co/jhta/di/service/step7/context-step7.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		EventNotificationServiceImpl impl = ctx.getBean("EventNotificationServiceImpl", EventNotificationServiceImpl.class);
		
		impl.noticeEvent("핵심기능"," 사용하기");
	}
}
