/*
* Sınıfın Nitelikleri
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
*
Sınıfın Metotları
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde
bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.*/
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
       this.name=name;
       this.salary=salary;
       this.workHours=workHours;
       this.hireYear=hireYear;

    }

    public double tax(){
        double tax;
        if(this.salary<1000){
            return 0;
        }
        else{
            tax= (this.salary*3)/100;
            return tax;
        }
    }

    public int bonus(){
        int bonus;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
            return bonus;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        double raise;
        if((2021-this.hireYear)<10){
            raise=(this.salary*5)/100;
            return raise;
        }
        else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
            raise=(this.salary*10)/100;
            return raise;
        }
        else if((2021-this.hireYear)>19){
            raise=(this.salary*15)/100;
            return raise;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        double salaryWithTaxesAndBonus=this.salary+bonus()-tax();
        double totalSalary=this.salary+bonus()+raiseSalary()-tax();
        return "Name: "+this.name+ "\n" +
               "Salary: "+this.salary+ "\n" +
               "Working Hours: "+this.workHours+ "\n" +
               "Hire Year: "+this.hireYear+ "\n" +
               "Tax: "+tax()+ "\n" +
               "Bonus: "+bonus()+ "\n" +
               "Salary Raise: "+raiseSalary()+ "\n" +
               "Salary with taxes and bonus: "+salaryWithTaxesAndBonus+ "\n" +
               "Total Salary: "+totalSalary;
    }

}
