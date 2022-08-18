package myproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class StockManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<Stock> st = new ArrayList<Stock>(); 
		   int choice; 
		  String stockIdenty,StockName,StockQuantity,stockDate,personIncharge;
		  String productName;
		   Scanner sc = new Scanner(System.in);
			
		while(true) {
			System.out.println("Enter choice:");
			System.out.println(" 1  Add Products in the Stock:");
			System.out.println(" 2  Show Product Details in the Stock:");
			System.out.println(" 3  Search for a Product in the Stock:");
			System.out.println(" 4  Delete Product in the Stock:");
			System.out.println(" 5  Update Product in the Stock: ");
			System.out.println(" 6  For Exit ");
		    System.out.println(" ---------------------------------------------**************************-----------------------------------------   ");
		
			choice = sc.nextInt();
			switch(choice) {
		
case 1:
				
				System.out.println("Enter Product Identy :");
				stockIdenty = sc.next();
				System.out.println("Enter  Product Name :");
				StockName = sc.next();
				System.out.println("Enter  Product Quantity :");
				StockQuantity = sc.next();
				System.out.println("Enter  Product Date :");
				stockDate = sc.next();
				System.out.println("Enter  Product PersonIncharge :");
				personIncharge = sc.next();
				Stock s = new Stock();
				s.setStockIdenty(stockIdenty);
				s.setStockName(StockName);;
				s.setStockQuantity(StockQuantity);
				s.setStockDate(stockDate);
				s.setPersonIncharge(personIncharge);
				st.add(s);
				System.out.println("====================================Product Details Added in the Stock:==========================================================");
				
				break;
				
case 2:
    	   System.out.println("Show Product Details in the Stock:\n");
    	   System.out.println("Product Identy"+"\t"+"ProductName"+"\t"+"ProductQuantity"+"\t "+"Product Date"+"\t"+"PersonIncharge");
			for(int i=0;i<st.size();i++) {
				System.out.println(  st.get(i).getStockIdenty()+"\t\t"+st.get(i).getStockName() +"\t\t" +st.get(i).getStockQuantity() +"\t\t "+st.get(i).getStockDate() +"\t\t"+st.get(i).getPersonIncharge()+"\n-----------------------------------------------------------------------------------------------------");
						         
						         
			}
				//System.out.println("----------------------------------------------------------------------------------------------------");
				break;

					
case 3:
				System.out.println("Enter Product Name for Search in the Stock:");
				 productName = sc.next();
				int srt = 0;
				
					
						  System.out.println("Product Identy"+"\t"+"ProductName"+"\t"+"ProductQuantity"+"\t "+"Product Date"+"\t"+"PersonIncharge");
						
						 for(int i=0;i<st.size();i++) {
							  if(st.get(i).getStockName().contains(productName)) {
								  System.out.println(  st.get(i).getStockIdenty()+"\t\t"+st.get(i).getStockName() +"\t\t" +st.get(i).getStockQuantity() +"\t\t "+st.get(i).getStockDate() +"\t\t"+st.get(i).getPersonIncharge()+"\n-----------------------------------------------------------------------------------------------------");
							         
					srt++;
				}
					}
					
					if(srt==0) {
						System.out.println("====================================================Product not found in the Stock========================================================");
					}else {
						System.out.println("=================================================Product Found in the Stock====================================================");
					}
					//System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						break;
				
case 4:
				System.out.println(" Enter Product Name for Delete the Details in the Stock:");
			String	productName1 = sc.next();
				int drt = 0;
				
				System.out.println("Product Identy"+"\t"+"ProductName"+"\t"+"ProductQuantity"+"\t "+"Product Date"+"\t"+"PersonIncharge");
				
				 for(int i=0;i<st.size();i++) {
					  if(st.get(i).getStockName().contains(productName1)) {
						  System.out.println(  st.get(i).getStockIdenty()+"\t\t"+st.get(i).getStockName() +"\t\t" +st.get(i).getStockQuantity() +"\t\t "+st.get(i).getStockDate() +"\t\t"+st.get(i).getPersonIncharge()+"\n-----------------------------------------------------------------------------------------------------");
					         
				st.remove(i);
				drt++;
					}
				}
					if(drt==0) {
						System.out.println("==============================================Product not Found in the Stock======================================================================================================\n");
					}else {
						System.out.println("=========================================== Product Details in the Stock  Deletely Succecfully===============================================================================\n");
						System.out.println("  Product Details in the Stock :\n");
				    	   System.out.println("Product Identy"+"\t"+"ProductName"+"\t"+"ProductQuantity"+"\t "+"Product Date"+"\t"+"PersonIncharge");
							for(int i=0;i<st.size();i++) {
								System.out.println(  st.get(i).getStockIdenty()+"\t\t"+st.get(i).getStockName() +"\t\t" +st.get(i).getStockQuantity() +"\t\t "+st.get(i).getStockDate() +"\t\t"+st.get(i).getPersonIncharge()+"\n-----------------------------------------------------------------------------------------------------");
										         
										         
							}
					}
				break;
			
case 5:
				System.out.println(" Enter Product Name  for Update in the Stock:");
			String	productName2 = sc.next();
				int upt = 0;
				
				
				 for(int i=0;i<st.size();i++) {
					  if(st.get(i).getStockName().contains(productName2)) {
						 
							System.out.print("Enter Product Details for update in the Stock:\n");
							System.out.print("Enter Product Name :  ");
							String productName3 = sc.next();
							st.get(i).setStockName(productName3);
							System.out.print("Enter Product Identy :  "  );
							String productIdenty = sc.next();
							st.get(i).setStockIdenty(productIdenty);
							System.out.print("Enter Product Quantity :  ");
							String productQuantity = sc.next();
							st.get(i).setStockQuantity(productQuantity);
							System.out.print("Enter Product Date :  ");
							String productDate = sc.next();
							st.get(i).setStockDate(productDate);
							System.out.print("Enter  PersonIncharge :  ");
							String personIncharge1 = sc.next();
							st.get(i).setPersonIncharge(personIncharge1);
							System.out.println("\n");
					         
						upt++;
				}
				}
				 
				if(upt==0) {
					System.out.println("=========================================================Product not Found in the Stock========================================================================\n");
				}else {
					System.out.println("=====================================================Product Details in the Stock Updated Succecfully================================================================\n");
					System.out.println(" Updated Product Details in the Stock :\n");
			    	   System.out.println("Product Identy"+"\t"+"ProductName"+"\t"+"ProductQuantity"+"\t "+"Product Date"+"\t"+"PersonIncharge");
						for(int i=0;i<st.size();i++) {
							System.out.println(  st.get(i).getStockIdenty()+"\t\t"+st.get(i).getStockName() +"\t\t" +st.get(i).getStockQuantity() +"\t\t "+st.get(i).getStockDate() +"\t\t"+st.get(i).getPersonIncharge()+"\n-----------------------------------------------------------------------------------------------------");
									         
									         
						}
				}
				
        break;

 case 6:
			  System.exit(0); 
			  
			  default: 
			  System.out.println("Invalid Input");
		 
  
 
	}
	
}
		}
	
	
}