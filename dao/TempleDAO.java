package com.xworkz.storedata.dao;
import java.util.Collection;
import com.xworkz.storedata.dto.*;
public interface TempleDAO {
	boolean save(TempleDTO dto);

	int totalItems();

	boolean delete(TempleDTO dto);

	TempleDTO findFirstItem();

	TempleDTO findLastItem();

	TempleDTO findByName(String name);

	TempleDTO findByLocation(String loc);

	TempleDTO findByLocationAndName(String location, String name);

	Collection<TempleDTO> findAll();

	Collection<TempleDTO> findAllTempleByLocationStartWith(char ch);

	Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);

	Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no);

	Collection<String> findAllLocations();
	
	String findLocationByName(String name);

}
