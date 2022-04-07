package day001;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda=new Araba();
        honda.setMedel("accord");
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("KİRMİZİ");

        Araba toyota=new Araba("avensis","beyaz",1500,-2020);
        Araba volvo=new Araba("s80","füme",2400,2010);

        Araba  hacimurat=new Araba(200,1974);

        System.out.println(honda);
        System.out.println(volvo);
        System.out.println("sectiginiz arac -->"+"modeli:"+toyota.getMedel()+" renk:"+toyota.getRenk()+
                " motor:"+toyota.getMotor()+" yil:"+toyota.getYil());

        System.out.println(hacimurat);
    }
}
