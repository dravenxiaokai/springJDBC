package ren.draven.service;

import java.util.List;

import ren.draven.bean.Person;

public interface PersonService {
	/**
	 * 保存person
	 * 
	 * @param person
	 */
	public void save(Person person);

	/**
	 * 更新person
	 * 
	 * @param person
	 */
	public void update(Person person);

	/**
	 * 获取person
	 * 
	 * @param personId
	 * @return
	 */
	public Person getPerson(Integer personId);

	/**
	 * 获取所有person
	 * 
	 * @return
	 */
	public List<Person> getPersons();

	/**
	 * 删除指定id的person
	 * 
	 * @param personId
	 */
	public void delete(Integer personId);
}
