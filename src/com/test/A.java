package com.test;

import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style= Style.RPC)
public interface A {
	
	public int empLeaveInfo(int empId, Date startDate,Date endDate);
}
