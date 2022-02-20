package com.tns.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accName;
	protected float charges;

	public ShopAcc(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}

	public void bookProduct(boolean isPrime, float deliveryCharge) {
		deliveryCharge += charges;
		if (isPrime == true) {
			System.out.println(accNo + " " + accName + " " + " Your product charge is: " + charges);
		} else {
			System.out.println(accNo + " " + accName + " " + " Your product charge is: " + deliveryCharge);
		}

	}

	public void items(int items) {
           System.out.println("Number of items is: " +items);       
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
