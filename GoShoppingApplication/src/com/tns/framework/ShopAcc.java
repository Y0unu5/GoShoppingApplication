package com.tns.framework;

public class ShopAcc {
	protected static int accNo;
	protected static String accNm;
	private float charges;
	
	public static int getAccNo() {
		return accNo;
	}
	public static void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}
	public static String getAccNm() {
		return accNm;
	}
	public static void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public ShopAcc(float charges) {
		
		this.charges = charges;
	}
	public ShopAcc(int accNo,String accNm, float charges)
	{
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Product booked and charges are:"+ charges);
	}
	public void items(float charges)
	{
		System.out.println("Items are delivered with charges :"+ charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [charges=" + charges + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
		