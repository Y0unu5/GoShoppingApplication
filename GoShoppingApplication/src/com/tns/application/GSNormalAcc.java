package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accName, float charges, float deliveryCharge) {
		super(accNo, accName, charges, deliveryCharge);

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
		return "GSNormalAcc [deliveryCharge=" + deliveryCharge + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
