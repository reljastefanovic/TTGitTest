package Package;

public class Krug implements Oblik {
    public double r;
    static double PI=3.14192;
    public Krug(double r)
    {
        this.r=r;
    }

    @Override
    public double izracunajPovrsinu() {
        System.out.println("POvrsina kruga");
        return r*r*PI;
    }

    @Override
    public double izracunajObim() {
        System.out.println("Obim kruga");
        return 2*PI*r;
    }
}
