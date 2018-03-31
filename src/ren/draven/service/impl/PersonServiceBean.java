package ren.draven.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import ren.draven.bean.Person;
import ren.draven.service.PersonService;

public class PersonServiceBean implements PersonService {
	// private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Person person) {
		jdbcTemplate.update("insert into person(name) value(?)", new Object[] { person.getName() },
				new int[] { java.sql.Types.VARCHAR });
	}

	public void update(Person person) {
		jdbcTemplate.update("update person set name=? where id=?", new Object[] { person.getName(), person.getId() },
				new int[] { java.sql.Types.INTEGER });
	}

	public Person getPerson(Integer personId) {
		return null;
	}

	public List<Person> getPersons() {
		return null;
	}

	public void delete(Integer personId) {
		jdbcTemplate.update("delete person where id=?", new Object[] { personId},
				new int[] { java.sql.Types.INTEGER });
	}

}
