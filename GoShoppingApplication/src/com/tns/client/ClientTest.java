package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class ClientTest {

	public static void main(String[] args) {
		ShopFactory sf =new GSShopFactory();
		PrimeAcc pa=new GSPrimeAcc(2022145, "Mk Younus ", 15000, true);
		NormalAcc na=new GSNormalAcc(202425, "Rohit", 2000, 100);
		pa.items(2);
		pa.bookProduct(true, 100);
		na.items(1);
		na.bookProduct(false, 100);

	}

}
