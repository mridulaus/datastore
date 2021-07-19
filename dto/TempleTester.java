package com.xworkz.storedata.dto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.storedata.dao.*;
public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			TempleDTO t1 = new TempleDTO(1, "Ganpati Teple", "Idugunji", 0, false, 2, true, "Ganapati", false);
			TempleDTO t2 = new TempleDTO(2, "Murudeshwara Temple", "Murudeshwara", 0, true, 10, true, "Shiva", true);
			TempleDTO t3 = new TempleDTO(3, "hanuman Temple", "Chandavara", 100, true, 10, true, "Hanuman", true);
			TempleDTO t4 = new TempleDTO(3, "DurgaMaa Temple", "VaishnoDevi", 100, true, 10, true, "VaishnoDevi Maa", true);

			TempleDAO dao = new TempleDAOImpl();
			dao.save(t1);
			dao.save(t2);
			dao.save(t3);
			dao.save(t4);
			System.out.println(dao.totalItems());

			dao.delete(t2);

			System.out.println("total items " + dao.totalItems());

			System.out.println("------------------------------------");
			
			System.out.println("first item " + dao.findFirstItem());

			System.out.println("------------------------------------");
			System.out.println("last item " + dao.findLastItem());

			System.out.println("------------------------------------");
			System.out.println(dao.findByName("hanuman temple"));

			System.out.println("------------------------------------");
			System.out.println(dao.findByLocation("Honnali"));

			System.out.println("------------------------------------");
			System.out.println(dao.findByLocationAndName("Mysore", "chamundeshwari temple"));

			System.out.println("------------------------------------");
			Collection<TempleDTO> all=dao.findAll();
			for (TempleDTO templeDTO : all) {
				System.out.println(templeDTO);
			}

			System.out.println("------------------------------------");
			Collection<TempleDTO> loc=dao.findAllTempleByLocationStartWith('M');
			for (TempleDTO templeDTO : loc) {
				System.out.println('H');
				System.out.println(templeDTO);
			}
			
			System.out.println("------------------------------------");
			Collection<TempleDTO> cost=dao.findAllTempleByEntryFeeGreaterThan(50);
			for (TempleDTO templeDTO : cost) {
				System.out.println(templeDTO);
			}
			
			System.out.println("------------------------------------");
			Collection<TempleDTO> noOfpoojari=dao.findAllTempleByNoOfPoojarisGreaterThan(6);
			for (TempleDTO templeDTO : noOfpoojari) {
				System.out.println(templeDTO);
			}
			
			System.out.println("------------------------------------");
			Collection<String> allLoc=dao.findAllLocations();
			for (String string : allLoc) {
				System.out.println(string);
			}
			
			System.out.println("------------------------------------");
			dao.findLocationByName("hanuman temple");
	}

}
