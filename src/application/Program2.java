package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====== TEST 1: department insert =======");
		
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Department inserted, new id: " + newDepartment.getId());
				
		System.out.println("====== FIM TEST 4 =======");
		System.out.println();
		
	}
}
