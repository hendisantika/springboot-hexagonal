package com.hendisantika.springboothexagonal.service;

import com.hendisantika.springboothexagonal.domain.Employee;
import com.hendisantika.springboothexagonal.port.EmployeeRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class EmployeeService {

    @Autowired
    private EmployeeRepositoryPort employeeRepository;

    public void create(String name, String role, long salary) {
        employeeRepository.create(name, role, salary);
    }

    public Employee view(Integer userId) {
        return employeeRepository.getEmployee(userId);
    }
}