package com.dampcave.spring.employees;


import com.dampcave.spring.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols") // можно установить мин и макс значение длины строки
    private String name;
//    @NotNull(message = "surname is required filed") // если длина 0, то прокатит
//    @NotEmpty(message = "surname is required filed") // если пробелы, то прокатит
    @NotBlank(message = "surname is required filed") // должена быть хоть одна буква
    private String surname;
    @Min(value = 500, message = "must be greater than 499") // минимальное числовое значение поля
    @Max(value = 1000, message = "must be less than 1001") // максимальное числовое равное значение поля
    private int salary;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "gmail.com",message = "email must end with gmail.com")
    private String email;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String,String> languageList;



    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Audi", "Audi");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("French", "FR");
        languageList.put("Deutsch", "DE");
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Map<String, String> getDepartments() {
        return departments;
    }
    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }
    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public Map<String, String> getCarBrands() {
        return carBrands;
    }
    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }
    public String[] getLanguages() {
        return languages;
    }
    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
    public Map<String, String> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }
    // End Getter and Setter

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
