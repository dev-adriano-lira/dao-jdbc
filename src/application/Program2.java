package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;


public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 3: department findAll ===");
        List<Department> departmentList = departmentDao.findAll();
        for (Department obj : departmentList) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: department insert ===");
        Department newDepartment = new Department(null, "Foods");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

    }

}
