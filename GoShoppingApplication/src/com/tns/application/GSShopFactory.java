package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsPrime = new GSPrimeAcc();
		return gsPrime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
		GSNormalAcc gsNorm = new GSNormalAcc(accNo, accNm, charges, deliveryCharge);
		return gsNorm;
	}

}
