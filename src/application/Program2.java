package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;


public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ===");
        Department newDepartment = new Department(null, "Foods");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 2: department update ===");
        Department department = departmentDao.findById(1);
        department.setName("Construction");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 3: department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("\n=== TEST 4: department findById ===");
        department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 5: department findAll ===");
        List<Department> departmentList = departmentDao.findAll();
        for (Department obj : departmentList) {
            System.out.println(obj);
        }

    }

}
