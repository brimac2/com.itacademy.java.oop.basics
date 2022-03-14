public class Employee {


    //    variables
    private String name;
    private String surname;
    private ContractType.ContractTypeName contractType;
    private String contractStartDate;
    private int salary;
    private String position;

    //
//    constructor empty
    public Employee() {
    }
    //    constructor empty end

    //    constructor
    public Employee(String name, String surname, ContractType.ContractTypeName contractType, String contractStartDate, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }


//    public Employee(String suzie, String jack, ContractType.ContractTypeName parttime, String contractStartDate, int salary, String manager) {
//    }

    //    constructor end
//      funkcija SET kuri nustato name
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContractType(ContractType.ContractTypeName contractType) {
        this.contractType = contractType;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeManager() {
        if (salary > 0) {
            return name + " " + surname + ". " + contractType + " employee which started " + contractStartDate + ". Starting salary is " + salary + "$ at " + position + " position.";
        }
        return name + " " + surname;
    }

}


