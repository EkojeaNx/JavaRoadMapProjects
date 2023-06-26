// Employee sınıfı

public class Employee {
    // Employee sınıfının nitelikleri
    String name;
    double salary;
    int workHours;
    short hireYear;

    // Employee sınıfının yapıcı(Constructor) metodu
    Employee(String name, double salary, int workHours, short hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Employee sınıfının metotları

    // Maaş 1000 TL'den büyük ise %3 vergi uygulama
    double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    // Haftalık çalışma saati 40'dan fazla olan her saat başına 30 TL bonus uygulama
    int bonus() {
        if (this.workHours >= 40) {
            int bonusTotal = 0;
            for (int i = 40; i < this.workHours; i++) {
                bonusTotal += 30;
            }

            return bonusTotal;
        } else {
            return 0;

        }
    }

    // Çalışma yılına göre maaş artışı hesaplama
    double raiseSalary() {
        short toDayYear = 2021;
        int workYear = toDayYear - this.hireYear;

        if (workYear >= 0 && workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return this.salary * 0.10;
        } else if (workYear > 20) {
            return this.salary * 0.15;
        } else {
            return 0;
        }
    }

    // Çalışana ait bilgileri ekrana yazma
    void toPrint() {
        double taxTotal, bonusTotal, raiseSalaryTotal, taxBonusTotal,  totalSalary;

        taxTotal = tax();
        bonusTotal = bonus();
        raiseSalaryTotal = raiseSalary();
        taxBonusTotal = this.salary + bonusTotal - taxTotal;
        totalSalary = this.salary + raiseSalaryTotal;

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + taxTotal);
        System.out.println("Bonus: " + bonusTotal);
        System.out.println("Maaş Artışı: " + raiseSalaryTotal);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + taxBonusTotal);
        System.out.println("Toplam Maaş: " + totalSalary);
    }
    
}
