class Account{
int acc_no;
String name;
double balance;
Account(int acc_no, String name, double amount)
{
this.acc_no=acc_no;
this.name=name;
this.balance=amount;
System.out.println("Account no:"+acc_no+"Name:"+name+"Balance:"+amount);
}
}
public class Practical1{
public static void main(String[] args){
Account acc = new Account(101,"Palak",5000);
}
}







































