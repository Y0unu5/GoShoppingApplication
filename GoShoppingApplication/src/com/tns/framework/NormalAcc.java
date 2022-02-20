package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{
     protected final float deliveryCharge;
     
     
    public NormalAcc(int accNo, String accName, float charges, float deliveryCharge) {
		super(accNo, accName, charges);
		this.deliveryCharge = deliveryCharge;
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
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



     
     
}
