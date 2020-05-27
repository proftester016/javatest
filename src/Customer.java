class Customer {

    //Answer is compile time error because of line 1


    public void display() {
    }
}
class Employee {
    public void display() {
    }
}
class Hello1{
    public static void main(String[] args) {
        Customer customer = new Customer();
       // Employee employee = (Employee) customer; //Line1
        //employee.display(); //Line2
    }
}