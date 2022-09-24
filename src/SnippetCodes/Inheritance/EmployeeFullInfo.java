package SnippetCodes.Inheritance;


public class EmployeeFullInfo {

    private String employeeId;
    private String employeeName;
    private String employeeSalary;
    private AddressDetails addressDetails;

    public EmployeeFullInfo(String employeeId, String employeeName, String employeeSalary, AddressDetails addressDetails) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.addressDetails = addressDetails;
    }


    public void displayInfo(){


        System.out.println("Here come the Employee information ::: " + employeeId + " :: "+ employeeName + " :: "+ employeeSalary + " :::" + addressDetails);
        System.out.println("Here we go with the address details ::" + addressDetails.toString());


    }

    public static void main(String[] args) {

        AddressDetails addressDetails1 = new AddressDetails("Hyderabad", "TA", "IND", "500059");


        EmployeeFullInfo empObj =  new EmployeeFullInfo("1001","Prerna", "15k",addressDetails1);

        empObj.displayInfo();


    }


}

