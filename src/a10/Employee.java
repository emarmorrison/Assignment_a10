package a10;

public abstract class Employee implements Display {
    private int id;
    private String firstname;
    private String lastname;
    private String DOB;
    private double pay;

    public Employee() {
    }

    public Employee(int id, String firstname, String lastname, String DOB, double pay) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.DOB = DOB;
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public  void display(){
        System.out.println("ID : "+ getId());
        System.out.println("First Name : "+ getFirstname());
        System.out.println("Last Name : "+ getLastname());
        System.out.println("D.O.B : " + getDOB());
    }

    public abstract void calculatePay();
}
