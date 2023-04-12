package homeworks.lesson17.Encapsulation;

public class Rectangle {
   private double a;
   private double b;
     public Rectangle(double a,double b){
         this.a=a;
         this.b=b;

     }
     public double getArea(){
         return a*b;

     }
     public double getPerimeter(){
         return 2*(a+b);
     }
     public double getA(){
         return a;

    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
         if (a>0){this.a = a;}
    }

    public void setB(double b) {
         if (b>0) {
             this.b = b;
         }
    }
}
