package com.Damera.StudentDAOImpl;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Damera.StudentDAO.StudentDAO;
import com.Damera.entity.StudentCompositeKey;
import com.Damera.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {

	private EntityManagerFactory factory;

	public StudentDAOImpl() {
		factory = Persistence.createEntityManagerFactory("test");
	}

	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			manager.persist(entity);
			tx.commit();
			System.out.println("Object persisted in database..");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Object not persisted in database..");
		} finally {
			manager.close();
		}
	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
		entityManager.close();
		return entity;
	}

	@Override
	public StudentEntity updateStudent(StudentCompositeKey compositeKey, Integer new_marks) {
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entity.setMarks(new_marks);
			tx.commit();
			System.out.println("Object updated in database..");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Object not updated in database..");
		} finally {
			entityManager.close();
		}
		return entity;
	}

	@Override
	public void deleteStudent(StudentCompositeKey compositeKey) {
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.remove(entity);
			tx.commit();
			System.out.println("Object deleted from the database..");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Object not deleted from the database..");
		} finally {
			entityManager.close();
		}
	}

}
