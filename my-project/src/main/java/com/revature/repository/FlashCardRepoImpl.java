package com.revature.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.entities.FlashCard;
import com.revature.util.HibernateUtil;

@Repository
public class FlashCardRepoImpl implements FlashCardRepo {

	@Autowired
	private HibernateUtil hu;

	@Override
	public List<FlashCard> findAll() {
		Session su = hu.getSession();
		Transaction tx = su.beginTransaction();
		String hql = "FROM com.revature.entities.FlashCard";
		@SuppressWarnings("unchecked")
		List<FlashCard> l = (List<FlashCard>) su.createQuery(hql).list();
		
		tx.commit();
		su.close();

		return l;

	}

}
