package com.test;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.test.A")
public class AImpl implements A{

	@Override
	public int empLeaveInfo(int empId, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return 24;
	}
	
}
