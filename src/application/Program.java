package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("====== TEST 1: seller findById =======");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("====== FIM TEST 1 =======");
		System.out.println();
		System.out.println("====== TEST 2: seller findByDepartment =======");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("====== FIM TEST 2 =======");
		System.out.println();
	
		System.out.println("====== TEST 3: seller findAll =======");
		
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("====== FIM TEST 3 =======");
		System.out.println();
		
		System.out.println("====== TEST 4: seller insert =======");
		
		Seller newSeller = new Seller(null, "Celio", "celio@teste.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
		System.out.println("====== FIM TEST 4 =======");
		System.out.println();
		
		System.out.println("====== TEST 5: seller Update =======");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update complete");
		
		System.out.println("====== FIM TEST 5 =======");
		System.out.println();
		
		System.out.println("====== TEST 6: seller Delete =======");
		System.out.print("Enter id for delete teste: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("User deleted!");
		
		System.out.println("====== FIM TEST 6 =======");
		System.out.println();
		
		sc.close();
		
	}
	

}
