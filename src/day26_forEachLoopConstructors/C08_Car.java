package day26_forEachLoopConstructors;

public class C08_Car {

    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";

    int yil=1998;
    int fiyat;
    String renk="Renk beliritilmemiş";


    @Override
    public String toString() {
        return "Araba Bilgileri==>" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
