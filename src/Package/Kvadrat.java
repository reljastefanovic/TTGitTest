package Package;

public class Kvadrat implements Oblik{
    int a;
    public Kvadrat(int a)
    {
        this.a=a;
    }
    @Override
    public double izracunajPovrsinu() {
        System.out.println("Povrsina kvadrata");
        return a+a;
    }

    @Override
    public double izracunajObim() {
        System.out.println("Obim kvadrata");
        return a*a;
    }
}
