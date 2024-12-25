package com.subrutin.belajarsping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      Employee employee = new Employee();
      employee.setId("1");
      employee.setFullName("Gunawan");
      employee.setAddress("lebak");

      Company company = new Company(employee);

      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

      Employee employeeBean = (Employee) applicationContext.getBean("employee");

      Company companyBean = (Company) applicationContext.getBean("company");

        System.out.println("Object employee yang dicreate by Spring :"+ employeeBean.toString());
        System.out.println("Object company yang dicreate by Spring :"+ companyBean.toString());

      System.out.println("Object employee yang di create by code :"+employee.toString());
      System.out.println("Object company yang di crate by code : "+company.toString());

    }
}
