package com.xworkz.storedata.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.storedata.dto.TempleDTO;

public class TempleDAOImpl  implements TempleDAO{
	private List<TempleDTO> list = new ArrayList<TempleDTO>();
	@Override
	public boolean save(TempleDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto " + dto);
		System.out.println("dto added " + added);
		return added;
	}

	@Override
	public int totalItems() {
		// TODO Auto-generated method stub
		int total = list.size();
		return total;
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed " + dto);
			return this.list.remove(dto);
		}
	
		return false;
	}

	@Override
	public TempleDTO findFirstItem() {
		// TODO Auto-generated method stub
		return this.list.get(0);
	}

	@Override
	public TempleDTO findLastItem() {
		// TODO Auto-generated method stub
		return this.list.get(list.size() - 1);
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(loc)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String location, String name) {
		TempleDTO namloc = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if ((templeDTO.getLocation().equals(location)) && (templeDTO.getName().equals(name))) {
				namloc = templeDTO;
				break;
			}
		}
		return namloc;
	}

	@Override
	public Collection<TempleDTO> findAll() {
		return list;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartWith(char ch) {

		Collection<TempleDTO> tempCollection = new ArrayList<>();
		char c = ch;
		String string = Character.toString(c);
		Iterator<TempleDTO> templeloc = this.list.iterator();
		while (templeloc.hasNext()) {
			TempleDTO temp = templeloc.next();
			if (temp.getLocation().startsWith(string)) {
				System.out.println("temple location starts with " + temp);
				tempCollection.add(temp);
			}
		}
		return tempCollection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Collection<TempleDTO> tempCollection = new ArrayList<>();
		Iterator<TempleDTO> temple = this.list.iterator();
		while (temple.hasNext()) {
			TempleDTO temp = temple.next();
			if(temp.getEntryFee()>cost) {
				System.out.println("temple entry fee "+temp);
				tempCollection.add(temp);
			}
		}
		return tempCollection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no) {
		Collection<TempleDTO> tempCollection = new ArrayList<>();
		Iterator<TempleDTO> temple = this.list.iterator();
		while (temple.hasNext()) {
			TempleDTO temp = temple.next();
			if(temp.getNoOfPoojaris()>no) {
				System.out.println("temple noofpoojari"+temp);
				tempCollection.add(temp);
			}
		}
		return tempCollection;
	}

	@Override
	public Collection<String> findAllLocations() {
		Collection<String> tempCollection = new ArrayList<>();
		Iterator<TempleDTO> temple = this.list.iterator();
		while (temple.hasNext()) {
			TempleDTO temp = temple.next();
			System.out.println("findAll locatio "+temp.getLocation());
			tempCollection.add(temp.getLocation());
		}
		return tempCollection;
	}

	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> temple = this.list.iterator();
		while (temple.hasNext()) {
			TempleDTO temp = temple.next();
			if(temp.getName().equals(name))
			System.out.println("find location "+temp.getLocation());
		}
		return name;
	}

}
