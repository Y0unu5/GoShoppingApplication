package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);

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
		return "GSPrimeAcc [isPrime=" + isPrime + ", charges=" + charges + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
