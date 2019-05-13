package Shinka.com.demojsf.service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="helloService")
@SessionScoped
public class HelloService {

	public String convert(String input) {
		return "HELLO: "+input.toUpperCase();
	}
	public static void main(String[] mgs) {
		HelloService hs = new HelloService();
		System.out.println(hs.convert("hi cong")); 
	}
}
