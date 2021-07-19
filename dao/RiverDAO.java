package com.xworkz.storedata.dao;
import com.xworkz.storedata.dto.*;
public interface RiverDAO {
	
	
	boolean save(RiverDTO dto); // c
	
	int totalItems(); // R
	void update(RiverDTO dto);  // U
	boolean delete(RiverDTO dto); //D
	
	
	
}
