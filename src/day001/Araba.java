package day001;

public class Araba {
   private String medel;
   private String renk;
   private int motor;
   private int yil;

    public Araba() {
    }

    public Araba(String medel, String renk, int motor, int yil) {
        this.medel = medel;
        this.renk = renk;
       // this.motor = motor;
       // this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    public Araba(int motor, int yil) {
        this.motor = motor;
        this.yil = yil;
    }

    public String getMedel() {
        return medel;
    }

    public void setMedel(String medel) {
        this.medel = medel;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000) {
            System.out.println("bucc de motormu olur");
            this.motor = 1200;
        }else
            this.motor = motor;


    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("o tarihte araba vardı da biz mi binmedik");
        }

    }

    @Override
    public String toString() {
        return "Araba{" +
                "medel='" + medel + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
