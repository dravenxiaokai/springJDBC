package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.draven.bean.Person;
import ren.draven.service.PersonService;

class PersonServiceTest {
	private static PersonService personService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 personService = (PersonService) context.getBean("personService");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void save() {
		personService.save(new Person("dravenxiaokai"));
	}

}
