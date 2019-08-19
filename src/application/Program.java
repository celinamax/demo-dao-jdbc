package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Noah Maximiano", "noah@gmail.com", new Date(), 4800.0, obj);
		
		System.out.println(obj);
		System.out.println(seller);
		
		
		
		
		sc.close();

	}

}
