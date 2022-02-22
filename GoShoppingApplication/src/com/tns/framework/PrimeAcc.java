package com.tns.framework;

public class PrimeAcc extends ShopAcc {

	public static boolean isPrime;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("Charges are : " + charges);
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime() + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
				+ getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";

	}

}