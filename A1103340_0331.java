import java.util.Scanner;

 class Animal {
    protected  String name;
    protected  double height;
    protected  double weight;
    protected  double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
    }

    public double distance(double time, double acceleration) {
        return time * acceleration * speed;
    }

    public double distance(double time) {
        return time * speed;
    }
    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    
    }
}

public class A1103340_0331 {
    public static void main(String[] args) {
    	double acceleration=0;
    	double distance=0;
        Animal snow = new Animal("Snow Bao", 1.1, 52.0, 100.0);
        Animal donkey = new Animal("Donkey", 1.5, 99.0, 200.0);
        Human ake = new Human("Ake", 1.9,80.0,"man", 150.0);
        Human hance = new Human("Hance", 1.8,78.0,"woman", 130.0);
        Human anna = new Human("Anna", 1.7,48.0,"woman", 120.0);
        Snow elsa = new Snow("Elsa", 1.7,50,"woman", "yes", 120.0);


       

        Scanner scanner = new Scanner(System.in);
        showinfo();
        System.out.print("Enter time (in minutes) for Snow Bao: ");
        double time = scanner.nextDouble();
        
        System.out.print("Enter acceleration (in double) for Snow Bao: ");
        if(scanner.hasNextDouble()) {
        	acceleration = scanner.nextDouble();
            
           
            
            
        	if(acceleration!=0) {distance = snow.distance(time, acceleration);
        	}else {
        		distance = snow.distance(time);
        	}
        }else {
            scanner.nextLine();
        	 distance = snow.distance(time);
             
        }
        snow.show();
        System.out.println("Snow Bao runs " + distance + " meters.");
      
        System.out.print("Enter time (in minutes) for Donkey: ");
        
        
        scanner.nextLine();
         time = scanner.nextDouble();
        
        System.out.print("Enter acceleration (in double) for Donkey: ");
        if(scanner.hasNextDouble()) {
        	acceleration = scanner.nextDouble();
        	if(acceleration!=0) {distance = donkey.distance(time, acceleration);
        	}else {
        		distance = donkey.distance(time);
        	}
        }else {
            scanner.nextLine();
        	 distance = donkey.distance(time);
        }
        donkey.show();
        System.out.println("Donkey runs " + distance +  "meters.");

        System.out.print("Enter time (in minutes) for Ake: ");
 
        scanner.nextLine();
         time = scanner.nextDouble();
        System.out.print("Enter acceleration (in double) for Ake: ");
        if(scanner.hasNextDouble()) {
        	acceleration = scanner.nextDouble();
        	if(acceleration!=0) {distance = elsa.distance(time, acceleration);
        	}else {
        		distance = elsa.distance(time);
        	}
        }else {
            scanner.nextLine();
        	 distance = elsa.distance(time);
        }
        ake.show();
        System.out.println("Ake runs " + distance + " meters");

        System.out.print("Enter time (in minutes) for Hance: ");
 
        scanner.nextLine();
         time = scanner.nextDouble();
        System.out.print("Enter acceleration (in double) for Hance: ");
        if(scanner.hasNextDouble()) {
        	acceleration = scanner.nextDouble();
        	if(acceleration!=0) {distance = elsa.distance(time, acceleration);
        	}else {
        		distance = elsa.distance(time);
        	}
        }else {
            scanner.nextLine();
        	 distance = elsa.distance(time);
        }
        hance.show();
        System.out.println("Hance runs " + distance + " meters");






        System.out.print("Enter time (in minutes) for Anna: ");
 
        
        scanner.nextLine();
         time = scanner.nextDouble();
        System.out.print("Enter acceleration (in double) for Anna: ");
        if(scanner.hasNextDouble()) {
        	acceleration = scanner.nextDouble();
        	if(acceleration!=0) {distance = donkey.distance(time, acceleration);
        	}else {
        		distance = anna.distance(time);
        	}
        }else {
            scanner.nextLine();
        	 distance = anna.distance(time);
        }





        anna.show();
        System.out.println("Anna runs " + distance + " meters.");
        System.out.print("Enter time (in minutes) for Elsa: ");
        
        scanner.nextLine();
         time = scanner.nextDouble();
        System.out.print("Enter acceleration (in double) for Elsa: ");
        if(scanner.hasNextDouble()) {
        	acceleration = scanner.nextDouble();
        	if(acceleration!=0) {distance = elsa.distance(time, acceleration);
        	}else {
        		distance = elsa.distance(time);
        	}
        }else {
            scanner.nextLine();
        	 distance = elsa.distance(time);
        }
        elsa.show();
        System.out.println("Elsa runs " + distance + " meters.");

        
        
        

        
        
        
       
    }
}
class Human extends Animal{
    String sex;
    public Human(String name, double height, double weight,String sex, double speed ) {
       super(name, height, weight, speed);
        this.sex=sex ;
    }


    void show(){
        System.out.println("姓名:"+name+" 身高:"+height+"(m)"+" 體重:"+weight+"(kg)"+" 性別"+sex+" 速度:"+speed+"(m/min)"); 
    }
}

class Snow extends Human{
    String snowskill;
    public Snow(String name, double height, double weight,String sex ,String snowskill,double speed ){
        super(name, height, weight, speed,sex);
         this.snowskill=snowskill ;
     }
 
 

    void show(){
        System.out.println("姓名:"+name+" 身高:"+height+"(m)"+" 體重:"+weight+"(kg)"+" 性別"+sex+" 冰雪技能:"+snowskill+" 速度:"+speed+"(m/min)"); 
    }

    double distance(int x ,double y){
        double k=x*y*speed;
        return 2*k;
    }

    double distance(int x){
        double k=x*speed;
        return 2*k;
    }


}

