class shape {
  void draw(){
  System.out.println("drawing shape");
  }
  void erase(){
  System.out.println("erasing shape");
  }
}
class circle extends shape{
 @Override
  void draw(){
  System.out.println(" i am drawing circle");
  
  }
  @Override
  void erase(){
  
  System.out.println(" i am erasing circle");
  }

}
class tringle extends shape{
 @Override
  void draw(){
  System.out.println(" i am drawing tringle");
  
  }
  @Override
  void erase(){
  
  System.out.println(" i am erasing tringle");
  }

}
class square extends shape{
 @Override
  void draw(){
  System.out.println(" i am drawing square");
  
  }
  @Override
  void erase(){
  
  System.out.println(" i ameasing square");
  }

}

 public class shape12{
 public static void main(String args[])
 {
 shape circle1 = new circle();
 shape tringle1= new tringle();
 shape square1 = new square();
  circle1.draw();
  circle1.erase();
  tringle1.draw();
  tringle1.erase();
  square1.draw();
  square1.erase();
  
 
 
 
 
 }
 
 
 
 
 
 
 
 }

 

  