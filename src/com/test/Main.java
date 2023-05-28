package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void CreateProduct(Product p){

}
    public static void main(String[] args) {

        ArrayList<Employee> MarketEmployee = new ArrayList<>();
        ArrayList<Product> MarketProducts = new ArrayList<>();
        Scanner s = new Scanner(System.in);


        Employee employeeAdmin = new Employee("kamel","01122136137","kamel@yahoo.com","123456","Admin");

        Employee SalesPerson = new Employee("noah","01095124699","noah@yahoo.com","123456","sales");


        MarketEmployee.add(employeeAdmin);
        MarketEmployee.add(SalesPerson);

        System.out.println("Welcome , Please Enter Your Email &Password");

        String Email = s.nextLine();
        String Password = s.nextLine();
        boolean successfullLogin=false;
        Employee currtentlyLogedinEmployee =new Employee();
        for (int i = 0; i < MarketEmployee.size(); i++)
        {
            if (MarketEmployee.get(i).Email.equals(Email))
            {
                if (MarketEmployee.get(i).Password.equals(Password))
                {
                    System.out.println("welcome "+ MarketEmployee.get(i).Name+" you are noe logged in ");
                    successfullLogin=true;
                    currtentlyLogedinEmployee=MarketEmployee.get(i);
                    break;

                }
            }
        }
        if (successfullLogin==false)
        {
            System.out.println("wrong email or password !!");
        }

        if (successfullLogin==true && currtentlyLogedinEmployee().equals("Admin")){
            while (true) {
                System.out.println("press 1 if you want to add new product \n" +
                        "press 2 if you want to view market products\n "+
                        "or 0 to exit\n"+
                        "or 3 to add new EmployeeUser\n"+
                        "or 4 to view market Employees");
                int choice = s.nextInt();
                if (choice == 1) {
                    System.out.println("please enter your product name ");
                    s = new Scanner(System.in);
                    String productName = s.nextLine();
                    System.out.println("please enter your product price ");
                    double productPrice = s.nextDouble();
                    System.out.println("please enter your product quantity ");
                    int productQuantity = s.nextInt();
                    System.out.println("please enter your product wight ");
                    double ProductWight = s.nextDouble();

                    Product NewProduct = new Product(productName, ProductWight, productPrice, productQuantity);
                    MarketProducts.add(NewProduct);

                }
                else if (choice == 2)
                {
                    System.out.println("market now has "+MarketProducts.size()+" products");
                    for (int i = 0; i < MarketProducts.size(); i++)
                    {

                        System.out.println("===========================================");
                        System.out.println("Product Name= " + MarketProducts.get(i).ProductName);
                        System.out.println("Product Price= " + MarketProducts.get(i).price);
                        System.out.println("Product Quantity= " + MarketProducts.get(i).quantity);
                        System.out.println("Product Weight= " + MarketProducts.get(i).weight);
                    }
                }else if (choice==3){
                    System.out.println("please enter the employee name ");
                    s = new Scanner(System.in);
                    String EmployeeName=s.nextLine();
                    System.out.println("please enter the employee Email ");
                    String EmployeeEmail=s.nextLine();
                    System.out.println("please enter the employee role ");
                     String EmployeeRole=s.nextLine();
                    Employee newEmployee=new Employee();


                }
                else if (choice==4){
                    System.out.println("There is "+MarketEmployee.size()+" Emplyee in the market");
                }
                else if (choice==0)
                    break;
            }
        }

    }



}