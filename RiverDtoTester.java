package com.xworkz.storedata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.xworkz.storedata.dao.*;
import com.xworkz.storedata.dto.*;
public class RiverDtoTester {

	public static void main(String[] args) {
		
		RiverDTO dto = new RiverDTO( "Kavery" , "talakaveri" , 805 ,4 , true);
		RiverDTO dto1 = new RiverDTO( "Sharavati" , "Ambutirtha" , 124 , 1 , true);
		RiverDTO dto2 = new RiverDTO( "Netravati" , "Dharastaa" , 124 , 1 , false);
		RiverDAO dao  = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		System.out.println(dao.totalItems());
		
		RiverDTO updatedDao = new RiverDTO( "Kavery" , "talakaveri" , 815 ,4 , true);
		
	dao.update(updatedDao);
	System.out.println("total ite "+ dao.totalItems());
	
	
	RiverDTO deletedDto =  new RiverDTO( "Netravati" , "Dharastaa" , 124 , 1 , false);
	dao.delete(deletedDto);
	System.out.println("total ites  " + dao.totalItems());
	}

}
