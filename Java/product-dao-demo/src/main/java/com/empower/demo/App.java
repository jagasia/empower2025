package com.empower.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.empower.demo.model.Product;
import com.empower.demo.model.ProductDao;
import com.empower.demo.model.ProductDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Product getProductDetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Id:");
		Long id=sc.nextLong();
		System.out.println("Name:");
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		System.out.println("Category:");
		String category=sc.nextLine();
		System.out.println("Price:");
		Double price=sc.nextDouble();
		Product product=new Product(id, name, category, price);
		return product;
		
	}
	
    public static void main( String[] args ) throws SQLException
    {
        Scanner sc=new Scanner(System.in);
        ProductDao pdao=new ProductDaoImpl();
        Product product=null;
        int no=0;
        Long id=0L;
        loop:
        do {
            System.out.println("1) Adding a Product\r\n"
            		+ "2) Updating a Product\r\n"
            		+ "3) Deleting a Product\r\n"
            		+ "4) View all Products\r\n"
            		+ "5) Find Product by Id\r\n"
            		+ "x) Exit");
            int choice=sc.nextInt();
            switch(choice) {
            case 1:		//add
            	product=getProductDetails();
            	no = pdao.create(product);
            	System.out.println(no+" row(s) inserted");
            	break;
            case 2:		//update
            	product=getProductDetails();
            	no = pdao.update(product);
            	System.out.println(no+" row(s) updated");
            	break;
            case 3:		//delete
            	System.out.println("Enter the id of the product to delete:");
            	id=sc.nextLong();
            	no=pdao.delete(id);
            	System.out.println(no+" row(s) updated");
            	break;
            case 4:		//all
            	List<Product> products = pdao.read();
            	for(Product p: products) {
            		System.out.println(p);
            	}
            	break;
            case 5:		//by id
            	System.out.println("Enter the id of the product to find:");
            	id=sc.nextLong();
            	product=pdao.read(id);
            	System.out.println(product);
            	break;
            default:
            	break loop;
            }
        }while(true);
    }
}
