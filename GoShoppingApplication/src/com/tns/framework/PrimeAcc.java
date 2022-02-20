package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {

	protected boolean isPrime;

	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}

	@Override
	public void bookProduct(boolean isPrime, float deliveryCharge) {

		super.bookProduct(isPrime, deliveryCharge);
	}

	@Override
	public void items(int items) {

		super.items(items);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", charges=" + charges + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
