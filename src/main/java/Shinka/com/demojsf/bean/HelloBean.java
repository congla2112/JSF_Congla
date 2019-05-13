package Shinka.com.demojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Shinka.com.demojsf.service.HelloService;

@ManagedBean
@SessionScoped
public class HelloBean {

	@ManagedProperty (value = "#{helloService}")
	HelloService helloService;
	
	private String name;

	public String sayHello() {
		this.name = helloService.convert(this.name);
		return "hello";
	}
	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
