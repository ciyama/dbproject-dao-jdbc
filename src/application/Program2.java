package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("====== TEST 1: department insert =======");
		
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Department inserted, new id: " + newDepartment.getId());
				
		System.out.println("====== FIM TEST 1 =======");
		 * */
		System.out.println();
		
		System.out.println("====== TEST 2: department findById =======");
		
		Department department = departmentDao.findById(2);
		System.out.println("Department findById id: " + department);
			
		System.out.println("====== FIM TEST 2 =======");
		System.out.println();

		System.out.println("====== TEST 3: department findAll =======");

		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		System.out.println("====== FIM TEST 3 =======");
		System.out.println();
		
		System.out.println("====== TEST 4 : department Udate =======");
		
		department = departmentDao.findById(11);
		department.setName("Sport");
		departmentDao.update(department);
		System.out.println("Update Complete!");
		
		System.out.println("====== FIM TEST 3 =======");
		System.out.println();
	}
}
