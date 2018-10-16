package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello/{name}")
 public String hello(@PathVariable String name) {
		String url = "http://localhost:7900/hello/"+name;   //直接访问
		//用动态列表
		url="http://provider-user:7900/hello/"+name;
		return this.restTemplate.getForObject(url, String.class);

	
}
}
