import java.util.Scanner;

 class Animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

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
}

public class A1103340_0324_1 {
    public static void main(String[] args) {
    	double acceleration=0;
    	double distance=0;
        Animal snow = new Animal("Snow Bao", 1.1, 52.0, 100.0);
        Animal donkey = new Animal("Donkey", 1.5, 99.0, 200.0);
        Animal anna = new Animal("Anna", 1.7, 48.0, 120.0);
        Animal elsa = new Animal("Elsa", 1.7, 50.0, 120.0);


       

        Scanner scanner = new Scanner(System.in);

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
        	 distance = snow.distance(time);
             
        }
        snow.show();
        System.out.println("Snow Bao runs " + distance + " meters.");
      
        System.out.print("Enter time (in minutes) for Donkey: ");
        
        scanner.nextLine();
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
        	 distance = donkey.distance(time);
        }
        donkey.show();
        System.out.println("Anna runs " + distance +  "meters.");
        System.out.print("Enter time (in minutes) for Anna: ");
        scanner.nextLine();
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
        	 distance = anna.distance(time);
        }
        anna.show();
        System.out.println("Anna runs " + distance + " meters.");
        System.out.print("Enter time (in minutes) for Elsa: ");
        scanner.nextLine();
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
        	 distance = elsa.distance(time);
        }
        elsa.show();
        System.out.println("Elsa runs " + distance + " meters.");

        
        
        

        
        
        
       
    }
}


