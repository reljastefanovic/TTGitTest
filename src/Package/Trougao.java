package Package;

public class Trougao implements Oblik{
    int a;
    int b;
    int c;
public Trougao(int a, int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
}
@Override
    public double izracunajPovrsinu() {
    double s=(a+b+c)/2;
    System.out.println("Povrsina trougla");
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

@Override
    public double izracunajObim() {
    System.out.println("Obim trougla");
        return a+b+c;
    }
}
