package com.test;

public class Employee {
    String Name;
    String PhoneNumber;
    String Email;
    String Password;
    String role;

    public Employee(String name, String phoneNumber, String email, String password, String role) {
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
        Password = password;
        this.role = role;

    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

}


