class grandparent
{
 String grandfathername ;
 String grandmothername ;
 
 grandparent( String  p, String q )
 {
  grandfathername=p;
  grandmothername=q;
  
  System.out.println("grandfather name is :"+grandfather);
  System.out.println("grandfather name is :"+grandmothername);
   
 }
} 
 class parent extends grandparent
{
  String fathername ;
  String mothername ;
   
 parent (String r, String s,String p,String  q)
{
   super(p,q);
  fathername=r;
  mothername=s;
  System.out.println("mothername is :"+mothername);
  System.out.println("fathername is:"+fathername);
}  

}

 class child extends  grandparent{
 
 //{  
 System.out.println("family ");
 //child(String p,String q,String r,String s){
 //super(p,q,r,s);
 } //
 public static void main(String[] args)
 {
 
 //child s1= new child( "ram","sita");
 //System.out.println("this is whole family");
 grandparent s2=new grandparent("ram","sita");
 
 }
  
 
 
 
 
 
 }
