package SnippetCodes.Inheritance;

//Explaining the parent class and child class relations


public class EmployeeSalary {

    String employeeId = "101";
    String employeeName = "Kittu";
    float employeeSalary = 45000;

}

    // IS-A relation with the Employee
     class bonusPoint extends EmployeeSalary{


         int bonus = 15000;

        public static void main(String[] args) {

        bonusPoint obj = new bonusPoint();

            System.out.println("Here we go with the o/p :::" + obj.employeeId);
            System.out.println("Here we go with the o/p :::" + obj.employeeName);
            System.out.println("Here we go with the o/p :::" + obj.employeeSalary);
            System.out.println("Here we go with the o/p :::" + obj.bonus);

        }
    }



