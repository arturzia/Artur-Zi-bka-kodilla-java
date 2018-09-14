package com.kodilla.hibernate.manytomany.facade;



import com.kodilla.hibernate.manytomany.Company;
        import com.kodilla.hibernate.manytomany.Employee;
        import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.*;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.ArrayList;
        import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuit {

    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private ArrayList<Company> resultCompanyList = new ArrayList<>();
    private ArrayList<Employee> resultEmployeeList = new ArrayList<>();


    @Test
    public void searchCompanyLikeTest() {

        //Given
        Employee johnNowak = new Employee("John", "Nowak");
        Employee lindaBrown = new Employee("Linda", "Brown");
        Employee janNowak = new Employee("Jan", "Nowak");

        Company software = new Company("Software");
        Company grey = new Company("Grey");
        Company abc = new Company("ABC");

        software.getEmployees().add(johnNowak);
        grey.getEmployees().add(lindaBrown);
        grey.getEmployees().add(janNowak);
        abc.getEmployees().add(johnNowak);
        abc.getEmployees().add(lindaBrown);

        johnNowak.getCompanies().add(software);
        johnNowak.getCompanies().add(abc);
        lindaBrown.getCompanies().add(grey);
        janNowak.getCompanies().add(grey);
        janNowak.getCompanies().add(abc);

        companyDao.save(software);
        companyDao.save(grey);
        companyDao.save(abc);

        resultCompanyList.add(software);
        resultCompanyList.add(grey);

        resultEmployeeList.add(johnNowak);
        resultEmployeeList.add(janNowak);
        //When
        List<Company> queryResult = searchFacade.searchCompanyLike("re");
        //Then
        Assert.assertEquals(resultCompanyList.size(), queryResult.size());
        //CleanUp
        try {
            companyDao.delete(software);
            companyDao.delete(grey);
            companyDao.delete(abc);
        } catch (Exception e) {
            //do nothing
        }

    }

    @Test
    public void searchEmployeeLikeTest() {

        //Given
        Employee johnNowak = new Employee("John", "Nowak");
        Employee lindaBrown = new Employee("Linda", "Brown");
        Employee janNowak = new Employee("Jan", "Nowak");

        Company software = new Company("Software");
        Company grey = new Company("Grey");
        Company abc = new Company("ABC");

        software.getEmployees().add(johnNowak);
        grey.getEmployees().add(lindaBrown);
        grey.getEmployees().add(janNowak);
        abc.getEmployees().add(johnNowak);
        abc.getEmployees().add(lindaBrown);

        johnNowak.getCompanies().add(software);
        johnNowak.getCompanies().add(abc);
        lindaBrown.getCompanies().add(grey);
        janNowak.getCompanies().add(grey);
        janNowak.getCompanies().add(abc);

        companyDao.save(software);
        companyDao.save(grey);
        companyDao.save(abc);

        resultCompanyList.add(software);
        resultCompanyList.add(grey);

        resultEmployeeList.add(johnNowak);
        resultEmployeeList.add(janNowak);

        //When
        List<Employee> queryResult = searchFacade.searchEmployeeLike("owa");
        //Then
        Assert.assertEquals(resultEmployeeList.size(), queryResult.size());

        try {
            companyDao.delete(software);
            companyDao.delete(grey);
            companyDao.delete(abc);
        } catch (Exception e) {
            //do nothing
        }
    }
}