package oopsproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class StocksAccount {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Stock> stockList = new ArrayList<Stock>();
	
	public void addStock() {
		Stock stock1 = new Stock();
		//int value = sc.nextInt();
		
		//for (int i=0;i<value;i++) {
			
		//}
		System.out.println("Plase Enter Stock Details");
		System.out.println("=========================");
		System.out.println("Plase Enter Stock Name");
		stock1.setStockName(sc.next());
		System.out.println("Plase Enter Number of Shares ");
		stock1.setNumOfShare(sc.nextInt());
		System.out.println("Plase Enter Share Price");
		stock1.setSharePrice(sc.nextInt());
		stockList.add(stock1);
		System.out.println("The Stock Details Are ");
		System.out.println("The value of Each Stock : "+(stock1.getNumOfShare()*stock1.getSharePrice()));
	//	System.out.println("The value of Whole Stock : "+());
		System.out.println(stockList);
		
	}
	
}
