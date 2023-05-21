import java.time.LocalDate;

public class EmpDriver {

    public static void main(String[] args) {
        Employee ali = new Employee("Ali",10000,150, LocalDate.of(2005,10,06));
        System.out.println(ali.toString());
        System.out.println();
        Employee veli = new Employee("Veli",12500,140,LocalDate.of(2000,10,02));
        System.out.println(veli.toString());

    }
}
