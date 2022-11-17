class balance extends Exception
{
 balance(String s){
     super(s);
 }
}

 public class bankaccount{
 int accno;
 double balance;
  bankaccount(int a,double b){
   accno=a;
   balance=b;
}
 void withdraw(int c);{
  if(c>balance){
  try{
  throw new balance("insufficient amount");
  }
    catch(balance e){
	System.out.println(e.getmeassage());
	}  
  }
 else{
   balance=balance -c ;
   System.out.println("current balance after withdrwal"+c-a);
   
  
  }




		  


void deposit(int d);{
	
	balance= balance + d;
	
  System.out.println();
	
	
} 
  void show();
  {
	  System.out.println("account number " +accno);
	  System.out.println("avialable balance"+balance);
	  
	  
	  
  }
   public static void main(String args[]){
	   bankaccount bank=new bankaccount(101,20000);
	   bank.withdraw(100);
	   bank.deposit(1000);
	   bank.show();
   }
}