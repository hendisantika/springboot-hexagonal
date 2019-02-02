package com.hendisantika.springboothexagonal.port;

import com.hendisantika.springboothexagonal.domain.Employee;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hexagonal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-02
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeRepositoryPort {
    void create(String name, String role, long salary);

    Employee getEmployee(Integer userId);
}
