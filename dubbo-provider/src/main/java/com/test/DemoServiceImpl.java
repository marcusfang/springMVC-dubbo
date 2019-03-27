package com.test;
import org.springframework.stereotype.Service;

import com.test.DemoService;
@Service("demoService")
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		System.out.printf("接收到了1条来自客户端的请求....");
		return "来自服务端发回的消息:"+name;
	}  

}
