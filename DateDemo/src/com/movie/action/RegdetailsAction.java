package com.movie.action;

import java.util.Date;
import java.util.List;

import com.movie.dao.RegdetailsDao;
import com.movie.model.Regdetails;

public class RegdetailsAction {
	public static void main(String[] args) {
		RegdetailsDao rdao = new RegdetailsDao();
		Regdetails reg = new Regdetails();
		/*reg.setUname("U002");
		reg.setPwd("pass2");
		reg.setFirstName("Sreejit");
		reg.setLastName("Kumat");
		reg.setEmail("ss@yahoo.com");
		reg.setMobNo("1232332");
		reg.setUserType("admin");
		reg.setRegdate(new Date());	
		rdao.save(reg);
		System.out.println("Inserted");*/
		
		reg=rdao.get("U001");
		System.out.println(reg);
		/*List<Regdetails> list1=rdao.getAll();
		for(Regdetails r:list1)
		{
			System.out.println(r);
		}*/
		
		/*reg=rdao.get("U001");
		reg.setPwd("newpass");
		rdao.update(reg);*/
		//rdao.delete("U002");
		
	}
}
