// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        String name;
        double salary;
        int workHours;
        short hireYear;

        // Kullanıcıdan çalışan bilgilerini alıyoruz
        System.out.print("Adınız: ");
        name = degerAl.nextLine();
        System.out.print("Maaşınız: ");
        salary = degerAl.nextDouble();
        System.out.print("Çalışma Saatiniz: ");
        workHours = degerAl.nextInt();
        System.out.print("Çalışma Yılınız: ");
        hireYear = degerAl.nextShort();

        // Çalışan tanımlıyoruz
        Employee employee = new Employee(name, salary, workHours, hireYear);
        // Çalışan bilgilerini ekrana yazıyoruz
        employee.toPrint();       

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
