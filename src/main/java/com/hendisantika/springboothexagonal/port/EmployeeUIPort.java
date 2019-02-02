package com.hendisantika.springboothexagonal.port;

import com.hendisantika.springboothexagonal.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hexagonal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-02
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeUIPort {
    @PostMapping("create")
    void create(@RequestBody Employee request);

    @GetMapping("view/{id}")
    Employee view(@PathVariable Integer userId);
}
