package com.hendisantika.springboothexagonal.adafter;

import com.hendisantika.springboothexagonal.domain.Employee;
import com.hendisantika.springboothexagonal.port.EmployeeRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hexagonal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-02
 * Time: 14:00
 * To change this template use File | Settings | File Templates.
 */
@Service
public class EmployeeServiceAdapter implements EmployeeRepositoryPort {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void create(String name, String role, long salary) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setRole(role);
        employee.setSalary(salary);

        entityManager.persist(employee);
    }

    @Override
    public Employee getEmployee(Integer userId) {
        return entityManager.find(Employee.class, userId);
    }
}