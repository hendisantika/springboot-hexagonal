package com.hendisantika.springboothexagonal.adafter;

import com.hendisantika.springboothexagonal.domain.Employee;
import com.hendisantika.springboothexagonal.port.EmployeeUIPort;
import com.hendisantika.springboothexagonal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hexagonal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-02
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/employees/")
public class EmployeeControllerAdapter implements EmployeeUIPort {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void create(@RequestBody Employee request) {
        employeeService.create(request.getName(), request.getRole(), request.getSalary());
    }

    @Override
    public Employee view(@PathVariable Integer id) {
        Employee employee = employeeService.view(id);
        return employee;
    }
}