package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: department findById =====");		
		Department dep = DepartmentDao.findById(9);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department insert =====");
		dep = new Department(null, "Cosmetics");
		DepartmentDao.insert(dep);
		int id = dep.getId();
		System.out.println("Insert new Id: " + id);		
		
		System.out.println("\n=== TEST 3: department update =====");
		dep = DepartmentDao.findById(11);
		dep.setName("Gardens");
		DepartmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 4: department delete =====");
		System.out.print("Enter id for delete test: ");
		id = sc.nextInt();		
		DepartmentDao.deleteById(id);		
		System.out.println("Department deleted!");		
		
		
		System.out.println("\n=== TEST 5: seller findAll =====");		
		List<Department> list = DepartmentDao.findAll();		
		for (Department obj : list) {
			System.out.println(obj);			
		}		
		sc.close();
	}

}
