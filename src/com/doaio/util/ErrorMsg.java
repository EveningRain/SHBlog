package com.doaio.util;

public class ErrorMsg {
	private static int errorNo = 0;
	
	public static String getError(){
		return "";
	}
	
	public static void setErrorNo(int errorNo){
		ErrorMsg.errorNo = errorNo;
	}
}
