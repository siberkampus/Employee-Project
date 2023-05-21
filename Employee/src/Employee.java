import java.time.LocalDate;

public class Employee {
    private String Name;
    private double Salary;
    private int workHours;
    private LocalDate hireDate;

    Employee(String Name,double Salary,int workHours,LocalDate hireDate){
        this.Name=Name;
        this.Salary=Salary;
        this.workHours=workHours;
        this.hireDate=hireDate;
    }
    public double Tax(){
        if(Salary<=1000){
            return 0;
        }
        return  (Salary*3)/100;
    }
    public double Bonus(){
        int extra = workHours-40;
        return extra*30;
    }
    public double RaiseSalary(){
        int year = LocalDate.now().getYear()-hireDate.getYear();
        if(year<10){
            return (Salary*5)/100;
        }
        else if(year>9 && year<20){
            return  (Salary*10)/100;
        }
        return (Salary*15)/100;
    }
    public String toString(){
        return "Name: "+Name+"\nSalary: "+Salary+"\nWork Hours: "+workHours+"\nHiredate: "+hireDate.getYear()+"\nTax: "+this.Tax()+"\nBonus: "+this.Bonus()+"\nRaise of Salary: "+this.RaiseSalary()+"\nTotal Salary: "+this.totalSalary()+"\nTotal Raise of Salary: "+this.totalRaiseSalary();
    }
    public double totalSalary(){
        return this.Salary+this.Bonus()-this.Tax();
    }
    public double totalRaiseSalary(){
        return  this.Salary+this.RaiseSalary();
    }
}
