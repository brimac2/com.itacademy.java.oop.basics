public class Employee {

    private String name;
    private String surname;
    private String contractType;
    private String contractStartDate;
    private int salary;
    private String position;

//    constructor empty
    public Employee() {
    }
    //    constructor empty end

//    constructor
    public Employee(String name, String surname, String contractType, String contractStartDate, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }
    //    constructor end

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContractType(String contractType) {
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getContractType() {
        return contractType;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}


