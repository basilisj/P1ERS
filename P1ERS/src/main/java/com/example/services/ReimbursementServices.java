package com.example.services;

import java.util.List;

import com.example.dao.ReimbursementDaoHib;
import com.example.dao.UsersDaoHib;
import com.example.model.Reimbursement;
import com.example.model.ReimbursementStatus;
import com.example.model.ReimbursementType;
import com.example.model.Users;

public class ReimbursementServices {

	private ReimbursementDaoHib rDao;
	private UsersDaoHib uDao;
	
	public ReimbursementServices(ReimbursementDaoHib r, UsersDaoHib u ) {
		this.rDao=r;
		this.uDao=u;
	}
	public Reimbursement createReim(int amount, String des, ReimbursementType type, ReimbursementStatus status ) {
		Reimbursement r = new Reimbursement(0, des, status, type);
		rDao.create(r);
		return r;
	}
}
