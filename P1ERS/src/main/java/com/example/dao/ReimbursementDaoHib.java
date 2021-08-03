package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Reimbursement;
import com.example.model.Users;
import com.example.util.HibernateUtil;

public class ReimbursementDaoHib implements ReimbursementDao{

	public ReimbursementDaoHib() {
		
	}
	@Override
	public void create(Reimbursement r) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(r);
		tx.commit();
	}

	
}
