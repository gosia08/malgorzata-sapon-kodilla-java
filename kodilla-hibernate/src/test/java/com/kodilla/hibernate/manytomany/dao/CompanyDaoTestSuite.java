package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            companyDao.delete(greyMatter);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveEmployeeByLastname() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        lindaKovalsky.getCompanies().add(softwareMachine);
        softwareMachine.getEmployees().add(lindaKovalsky);
        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(dataMaesters);
        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(johnSmith);
        String expected = "Smith";

        //When
        employeeDao.save(johnSmith);
        List<Employee> employeeList = employeeDao.retrieveEmployeesByLastName("Smith");

        //Than
        for (Employee employee:employeeList) {
            String actual = employee.getLastname();
            Assert.assertEquals(expected, actual);
        }

        //CleanUp
        try {
            employeeDao.delete(johnSmith);
            employeeDao.delete(lindaKovalsky);
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveCompanyByFirstThreeLetters() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(dataMaesters);
        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(johnSmith);

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        List<Company> companyList = companyDao.retrieveCompanyByFirstThreeLetters("Sof");

        //Than
        for (Company company:companyList) {Assert.assertTrue(company.getName().startsWith("Sof"));}

        //CleanUp
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            employeeDao.delete(johnSmith);
        } catch (Exception e) {
            //do nothing
        }
    }

}