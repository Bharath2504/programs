package com.ArrayLIst;

import java.util.ArrayList;

public class ChangeArrayListElement {

	public static void main(String[] args) {
		
		ArrayList<String> heros= new ArrayList<>();
		
		heros.add("MaheshBabu");
		heros.add("NTR");
		heros.add("RamCheran");
		heros.add("PavanKalyan");
		
		System.out.println("arraylist :" + heros);
		
		heros.set(2, "AlluArjun");
		System.out.println("Modified Array lIst :" + heros);

	}

}
