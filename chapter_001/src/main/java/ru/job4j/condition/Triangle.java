package ru.job4j.condition;
/**
 * How to build triangle
 * @author MPestereva

 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double perimeter(double ab, double bc, double ac){
        double p=(ab+bc+ac)/2;
        return p;
    }
    private boolean exist(double ab, double bc, double ac) {
        boolean result = false;
        if (((ab+bc)>ac)&((ab+ac)>bc)&((ac+bc)>ac)){result=true; }
        //System.out.println(result);
        return result;

    }
    public double area () {
        double area=-1;
        double ab=a.distanceTo(b);
        double bc=b.distanceTo(c);
        double ac=a.distanceTo(c);
        double p = perimeter(ab,bc,ac);
        if(exist(ab,bc,ac)){area = Math.sqrt(p *(p - ab) * (p - ac) * (p - bc));}
        return area;
    }
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point (1,1);
        Triangle abc = new Triangle(a,b,c);
        double ab= a.distanceTo(b);
        double bc=b.distanceTo(c);
        double ac=a.distanceTo(c);
        System.out.println(ab);
        System.out.println(bc);
        System.out.println(ac);
        double res=abc.area();

        System.out.println(res);
    }
}
