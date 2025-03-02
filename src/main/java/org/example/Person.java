package org.example;

public class Person {

    private String id;
    private String name;
    private Integer age;
    private Float salary;
    private Integer yearsOfWork;
    private String department;

    public Person(String id, String name, Integer age, Float salary, Integer yearsOfWork, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.yearsOfWork = yearsOfWork;
        this.department = department;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Integer getYearsOfWork() {
        return yearsOfWork;
    }

    public void setYearsOfWork(Integer yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
