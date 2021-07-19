package com.xworkz.storedata.dto;

import com.xworkz.storedata.constants.*;
import com.xworkz.storedata.dao.*;

import java.util.Collections;

public class HighwayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HighwayDTO dto = new HighwayDTO(1, 64, HighwayType.NATIONAL_HIGHWAYS, "Pune", 160, false, "IRB");
		HighwayDTO dto1 = new HighwayDTO(2, 50, HighwayType.STATE_HIGHWAYS, "Karnataka", 77, true, "HCC");

		HighwayDTO dto2 = new HighwayDTO(3, 12, HighwayType.URBAN_HIGHWAYS, "Bh", 67, false, "TATA PROJECTS");

		HighwayDAO dao = new HighwayDAOImpl();

		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);

		System.out.println("************");
		System.out.println(dao.totalItems());

		System.out.println("************");
		System.out.println(dao.findAll());

		System.out.println("************");
		System.out.println(dao.findAllNumber());

		System.out.println("************");
		System.out.println("stateName" + dao.findByStateName("Karnataka"));

		System.out.println("************");
		System.out.println("Highwaytype" + dao.findByHighWayType(HighwayType.STATE_HIGHWAYS));

		System.out.println("************");
		System.out.println("HighwayLengthByNumber " + dao.findLengthByNumber(20));

		System.out.println("************");
		System.out.println("HighwayCOndition " + dao.isCondition(50));

		System.out.println("************");
		System.out.println("Exist " + dao.exist(dto2));

		System.out.println("************");
		System.out.println("findNumberByStateName" + dao.findNumberByStateName("TamilNadu"));

		System.out.println("************");
		System.out.println("Maximun length " + dao.findByMaxLength());

		System.out.println("************");
		System.out.println("Minimun length is " + dao.findByMinLength());

		System.out.println("************");
		System.out.println("Delete highway " + dao.delete(dto));

	}
}
