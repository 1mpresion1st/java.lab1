package ru.mirea.lab2.ex6;

public class Circle {
    private double Diameter;
    private String name;

    public Circle(double Diameter, String name){
        this.Diameter = Diameter;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDiameter(double Diameter) {
        this.Diameter = Diameter;
    }
    public double getDiameter() {
        return Diameter;
    }

    public double getSquare(double Diameter){
        double Square;
        Square = 3.14 * (Diameter/2)* (Diameter/2);
        return Square;
    }

    public double getPerimeter(double Diameter){
        double Perimeter;
        Perimeter = 2 * 3.14 * (Diameter/2);
        return Perimeter;
    }
    public static void Compare(Circle n1, Circle n2){
        if (n1.getDiameter() > n2.getDiameter()){
            System.out.println(n1.getName() + " is bigger" + " than " + n2.getName());
        } else if (n1.getDiameter() < n2.getDiameter()) {
            System.out.println(n2.getName() + " is bigger"  + " than " + n1.getName() );
        } else {System.out.println("Circles are same");}
    }

    @Override
    public String toString(){
        return "Circle {" +
                "Diameter " + Diameter +
                " name " + name +
                "}";
    }

}
