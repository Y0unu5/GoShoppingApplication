package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
	}

	public void bookProduct(float charges) {
		System.out.println(
				"Dear Normal User, Your Charges are: " + charges + " with Delivery Charge is :" + deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}

}
