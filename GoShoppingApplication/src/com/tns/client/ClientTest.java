package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class ClientTest {

	public static void main(String[] args) {

		// Step 1
		GSShopFactory gsfactory = new GSShopFactory();
		gsfactory.getNewPrimeAccount(191, "Yunus", 1000, true);
		gsfactory.getNewNormalAccount(201, "Sam", 1000, 50);

		// Step2
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();

		// Step 4
		gsprime.bookProduct(10000); // Step5
		gsprime.toString();

		// Step 3
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();

		gsnormal.bookProduct(10000);
		gsnormal.toString();

	}

}
