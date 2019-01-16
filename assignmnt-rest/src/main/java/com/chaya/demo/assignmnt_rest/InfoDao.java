package com.chaya.demo.assignmnt_rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoDao 
{

	public Map<Integer, Info> getInfo()
	{
		Info i1= new Info("karnataka", "bangalore", "India");
		Info i2= new Info("maharastra", "mumbai", "India");
		
		Map<Integer, Info> map= new HashMap();
	 map.put(2099,i1);
		map.put(1000,i2);
		
		return map;
	}
}
