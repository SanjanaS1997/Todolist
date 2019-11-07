package com.spiders.app.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spiders.app.dto.Address;
import com.spiders.app.dto.UserDto;

@Repository
public abstract class UserDaoImpl implements UserDaoI {

	@PostConstruct
	void init() {

		// for initilizing the data base

		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();

			/*UserDto admin1 = new UserDto();
			admin1.setAdminId(0);
			admin1.setAge(31);
			admin1.setDepartment("development");
			admin1.setRole("ADMIN");
			admin1.setFirstName("kiran");
			admin1.setLastName("kaur");
			admin1.setEmail("kiran@gamil.com");
			admin1.setPassword("admin");
			admin1.setUserName("kiran123");
			admin1.setAddress(new Address("ludhaina", "5 street", "141001", "punjab"));
			admin1.setMobileNo("9988779988");

			UserDto admin2 = new UserDto();
			admin2.setAdminId(0);
			admin2.setAge(28);
			admin2.setDepartment("testing");
			admin2.setRole("ADMIN");
			admin2.setFirstName("ram");
			admin2.setLastName("kumar");
			admin2.setEmail("ram123@gamil.com");
			admin2.setPassword("admin");
			admin2.setUserName("ram123");
			admin2.setAddress(new Address("kullu", "10 street", "211101", "himachal"));
			admin2.setMobileNo("9900779900");
*/
			UserDto user1 = new UserDto();
			user1.setId(1);
			user1.setUser("xy");
			user1.setDescription("dhjkk");
			
			UserDto user2 = new UserDto();
			user2.setId(2);
			user2.setUser("xyz");
			user2.setDescription("dhjkhghk");
			
			
			UserDto user3 = new UserDto();
			user3.setId(3);
			user3.setUser("xya");
			user3.setDescription("dhjfdfkk");
			
			
			int dbDate = session.createQuery("from UserDto").list().size();

			if (dbDate <= 0) {
				session.save(user1);
				session.save(user2);
				session.save(user3);
				}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Serializable saveUser(UserDto user) {

		Serializable id = 0;
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			id = session.save(user);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return id;
	}

/*	@Override
	public void updateUser(UserDto user) {
		Serializable id = 0;
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();

			// find user by id and update user
			UserDto userFromDb = session.get(UserDto.class, user.getId());

			//userFromDb.setAddress(user.getAddress());

			session.update(userFromDb);

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
*/
	
	public void deleteTask(UserDto user) {

		Serializable id = 0;
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			UserDto userfromDb = session.get(UserDto.class, user.getId());
			session.delete(userfromDb);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	/*@Override
	public UserDto (String loginId) {
		UserDto userFromDb = null;
		try (Session session = sessionFactory.openSession()) {
			// find by email
			Query<UserDto> query = session.createQuery("from UserDto where email = :loginId ");
			query.setParameter("loginId", loginId);
			userFromDb = query.uniqueResult();

			if (userFromDb == null) {// find by mobile no
				query = session.createQuery("from UserDto where mobileNo = :loginId ");
				query.setParameter("loginId", loginId);
				userFromDb = query.uniqueResult();

			}
			if (userFromDb == null) {// find by user name
				query = session.createQuery("from UserDto where userName = :loginId ");
				query.setParameter("loginId", loginId);
				userFromDb = query.uniqueResult();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userFromDb;
	}
*/
	
	public  UserDto UserDto  (int id) {
		UserDto userfromDb = null;

		try (Session session = sessionFactory.openSession()) {
			userfromDb = session.get(UserDto.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userfromDb;
	}

	
	public List<UserDto> getAllTaskById(int id) {
		List<UserDto> allUser = null;
		try (Session session = sessionFactory.openSession()) {
			// find by user id
			Query<UserDto> query = session.createQuery("from UserDto where userId = :userId ");
			query.setParameter("userId", id);
			allUser = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allUser;
	}

	@Override
	public void updateTask(UserDto user) {
		// TODO Auto-generated method stub
		
	}

}
