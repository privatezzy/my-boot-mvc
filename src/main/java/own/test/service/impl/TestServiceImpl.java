package own.test.service.impl;

import own.test.service.TestService;

public class TestServiceImpl implements TestService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
