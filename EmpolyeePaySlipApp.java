import java.util.*;
class Employee
{
String empName, empId, address, mailId, mobileNo;
double basicPay, da, hra, pf, staffClub, gross, net;
Scanner sc = new Scanner(System.in);
void readDetails()
{
System.out.println("Enter Employee name: ");
empName = sc.nextLine();
System.out.println("Enter Employee ID: ");
empId = sc.nextLine();
System.out.println("Enter Employee address: ");
address = sc.nextLine();
System.out.println("Enter Employee Mail ID: ");
mailId = sc.nextLine();
System.out.println("Enter Employee Mobile No: ");
mobileNo = sc.nextLine();
System.out.println("Enter Basic Pay: ");
basicPay = sc.nextDouble();
}

void displayDetails()
{
System.out.println("Employee name: "+empName);
System.out.println("Employee ID: "+empId);
System.out.println("Employee address: "+address);
System.out.println("Employee Mail ID: "+mailId);
System.out.println("Employee Mobile No: "+mobileNo);
System.out.println("Employee Basic Pay: "+basicPay);
}
}

class Programmer extends Employee
{
void calculatePaySlip()
{
da = basicPay * 97/100;
hra = basicPay * 10/100;
pf = basicPay * 12/100;
staffClub = basicPay * 1/100;
gross = basicPay + da + hra;
net = gross - (pf + staffClub);
}

void generatePaySlip()
{
System.out.println("Designation: Programmer");
System.out.println("DA: "+da);
System.out.println("HRA: "+hra);
System.out.println("PF: "+pf);
System.out.println("Staff Club: "+staffClub);
System.out.println("Gross Pay: "+gross);
System.out.println("Net Pay: "+net);
}
}

class AssistantProfessor extends Employee
{
void calculatePaySlip()
{
da = basicPay * 110/100;
hra = basicPay * 20/100;
pf = basicPay * 12/100;
staffClub = basicPay * 5/100;
gross = basicPay + da + hra;
net = gross - (pf + staffClub);
}

void generatePaySlip()
{
System.out.println("Designation: Assistant Professor");
System.out.println("DA: "+da);
System.out.println("HRA: "+hra);
System.out.println("PF: "+pf);
System.out.println("Staff Club: "+staffClub);
System.out.println("Gross Pay: "+gross);
System.out.println("Net Pay: "+net);
}
}

class AssociateProfessor extends Employee
{
void calculatePaySlip()
{
da = basicPay * 130/100;
hra = basicPay * 30/100;
pf = basicPay * 12/100;
staffClub = basicPay * 10/100;
gross = basicPay + da + hra;
net = gross - (pf + staffClub);
}

void generatePaySlip()
{
System.out.println("Designation: Associate professor");
System.out.println("DA: "+da);
System.out.println("HRA: "+hra);
System.out.println("PF: "+pf);
System.out.println("Staff Club: "+staffClub);
System.out.println("Gross Pay: "+gross);
System.out.println("Net Pay: "+net);
}
}

class Professor extends Employee
{
void calculatePaySlip()
{
da = basicPay * 140/100;
hra = basicPay * 40/100;
pf = basicPay * 12/100;
staffClub = basicPay * 15/100;
gross = basicPay + da + hra;
net = gross - (pf + staffClub);
}

void generatePaySlip()
{
System.out.println("Designation: Professor");
System.out.println("DA: "+da);
System.out.println("HRA: "+hra);
System.out.println("PF: "+pf);
System.out.println("Staff Club: "+staffClub);
System.out.println("Gross Pay: "+gross);
System.out.println("Net Pay: "+net);
}
}

public class EmpolyeePaySlipApp
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Employee Designation: \n1.Programmer \n2.Assistant Professor \n3.Associate Professor \n4.Professor");
int choice = sc.nextInt();
sc.nextLine();
switch(choice)
{
case 1:
 Programmer p = new Programmer();
 p.readDetails();
 p.displayDetails();
 p.calculatePaySlip();
 p.generatePaySlip();
 break;
case 2:
 AssistantProfessor asp = new AssistantProfessor();
 asp.readDetails();
 asp.displayDetails();
 asp.calculatePaySlip();
 asp.generatePaySlip();
 break;
case 3:
 AssociateProfessor atp = new AssociateProfessor();
 atp.readDetails();
 atp.displayDetails();
 atp.calculatePaySlip();
 atp.generatePaySlip();
 break;
case 4:
 Professor po = new Professor();
 po.readDetails();
 po.displayDetails();
 po.calculatePaySlip();
 po.generatePaySlip();
 break;
default:
 System.out.println("Invalid choice");
}
sc.close();
}
}
