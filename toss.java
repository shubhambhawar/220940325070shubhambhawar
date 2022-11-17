class test111
{
 
 void show1()
 {
   System.out.println("hello i am class 1");
 
 }
 
}

class test123 extends test111
{
	void show2234()
	{
		System.out.println("heloo i am class 3");
		
	}
	
}
  
  
class toss extends test123
{
 void show2()
 {
 
  System.out.println("hello i am class 2 ");
  
 }
  public static void main(String args[])
  {
   toss t1= new toss();
   t1.show2();
   t1.show1();
  
  
  
  
  }





}  