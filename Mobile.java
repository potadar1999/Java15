package com.que2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		ArrayList<String>mo=new ArrayList<>();
		
		if(!mobiles.containsKey(company)) {
			mo.add(model);
			mobiles.put(company, mo);
		}
		else {
			mo=mobiles.get(company);
			mo.add(model);
			mobiles.put(company, mo);
		}
		return "Mobile add Sucessfully";
	}
	
	public List<String> getModels(String company){
		List<String>list=new ArrayList<>();
		if(mobiles.containsKey(company)) {
			list=mobiles.get(company);
		}
		return list;
	}

	
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		
		System.out.println(mobile.addMobile("a", "a1"));
		
	}


}
