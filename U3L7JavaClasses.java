//Malia Moreno | 10 October 2024//
/*
1) What is the difference between a class and an object?
- a class is an all encompasing blueprint for code to run while an object is a variable defined and used by classes

2) What happense when you pass an object to a print or println method?
- Passing an object with print or println shows the object in static void through the method's type. For example, 
  an integer object will be printed out as an integer

3) What is the scope of a variable in a method? In a class?
- A variable in a method only exists within the method and nowhere else wher as a variable in a class can exist beyond that
*/
package com.mycompany.u3l7javaclasses;

public class U3L7JavaClasses {
    public static void main(String[] args) {
        System.out.println("Lets make a car!\n");
        
        //make class usable//
        Car driver;
        driver = new Car();
        
        //make a driver method in main to create a car type: VW Bug
        //give them engine power and max speed
        driver.setCarBrand("VW Bug");
        driver.setEnginePower(174);
        driver.setMaxSpeed(112);
        driver.setPrice(21790);
        System.out.println("Car: "+driver.getCarBrand()+" | Engine Power: "+driver.toString("enginepower")+" | Max Speed: "+driver.toString("maxspeed")+" | Price: "+driver.toString("price"));
        
        //now make car type: Toyota Prius//
        driver.setCarBrand("Toyota Prius");
        driver.setEnginePower(194);
        driver.setMaxSpeed(205);
        driver.setPrice(27950);
        System.out.println("Car: "+driver.getCarBrand()+" | Engine Power: "+driver.toString("enginepower")+" | Max Speed: "+driver.toString("maxspeed")+" | Price: "+driver.toString("price"));
        
        //now make car type: BMW i8//
        driver.setCarBrand("BMW i8");
        driver.setEnginePower(369);
        driver.setMaxSpeed(155);
        driver.setPrice(163300);
        System.out.println("Car: "+driver.getCarBrand()+" | Engine Power: "+driver.toString("enginepower")+" | Max Speed: "+driver.toString("maxspeed")+" | Price: "+driver.toString("price"));
        
        //now make car type: Testla Model 3//
        driver.setCarBrand("Tesla Model 3");
        driver.setEnginePower(510);
        driver.setMaxSpeed(162);
        driver.setPrice(42490);
        System.out.println("Car: "+driver.getCarBrand()+" | Engine Power: "+driver.toString("enginepower")+" | Max Speed: "+driver.toString("maxspeed")+" | Price: "+driver.toString("price"));
        
        System.out.println("\n\nYes, I'm working");
    }
}

//make a class called car that has 1 string variable = "carBrand"
//With: int variabled "enginePower"(HP), double variable "maxSpeed"(MPH), double variabled "price"($)
class Car{
    private String carBrand;
    private int enginePower;
    private double maxSpeed, price;

    //write a constructor to produce a car base//
    public Car(){
        carBrand = "Toyota";
        enginePower = 160;
        maxSpeed = 117;
        price = 23145;
    }

    //write methods to set carBrand, enginePower, maxSPeed, and price//
    public void setCarBrand(String input){
        carBrand = input;
    }
    public void setEnginePower(int input){
        enginePower = input;
    }
    public void setMaxSpeed(double input){
        maxSpeed = input;
    }
    public void setPrice(double input){
        price = input;
    }

    //write method to get carBrand, enginePower, maxSpeed, and price//
    public String getCarBrand(){
        return carBrand;
    }
    public int getEnginePower(){
        return enginePower;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public double getPrice(){
        return price;
    }

    //write a toString method to print out details//
    public String toString(String input){
        String strEngPow = Integer.toString(enginePower);
        String strMaxSpe = Double.toString(maxSpeed);
        String strPri = Double.toString(price);

        //figure out what to return//
        if(input.toLowerCase() == "enginepower"){
            return strEngPow+" HP";
        }else if(input.toLowerCase() == "maxspeed"){
            return strMaxSpe+" MPH";
        }else if(input.toLowerCase() == "price"){
            return "$"+strPri;
        }
        return "incorrect input";
    }
}
