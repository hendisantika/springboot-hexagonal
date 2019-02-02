package com.hendisantika.springboothexagonal.domain;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hexagonal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-02
 * Time: 13:51
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "salary", nullable = false)
    private long salary;

    public Employee() {

    }

    public Employee(Integer id, String name, String role, long salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}

