package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		
		
		
		sc.close();

	}

}
