package com;

import com.sungnam.util.internal.AddHelper;

public class Runner {

	public static void main(String[] args) {
		AddHelper ah;
		ah = new AddHelper();
		int result = ah.add(5, 10);
		System.out.print(result);
		
	}

}
