package com.xworkz.storedata.dao;

import com.xworkz.storedata.dto.*;
import com.xworkz.storedata.dto.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RiverDAOImpl implements RiverDAO {
	private List<RiverDTO> list = new ArrayList<RiverDTO>();

	@Override // create
	public boolean save(RiverDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto " + dto);
		System.out.println("dto was added " + added);
		return added;

	}

	@Override
	public int totalItems() {
		int total = list.size();
		return 0;
	}

	@Override //update
	public void update(RiverDTO dto) {
		// TODO Auto-generated method stub
		boolean exist = this.list.contains(dto);
		if (exist) {
			System.out.println("river found , will update " + dto);
			int indexOfRiver = this.list.indexOf(dto);
			this.list.set(indexOfRiver, dto);
		} else {

			System.out.println("River doesn't exist");

		}

	}

	@Override // delte
	public boolean delete(RiverDTO dto) {
		// TODO Auto-generated method stub
		if (this.list.contains(dto)) {
			System.out.println("removed  " + dto);
			return this.list.remove(dto);
		}
		return false;
	}
}
