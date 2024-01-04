package org.example;

public class BaseKrediManager {
    public double hesapla(double tutar){ //public final double yazılırsa override edilemiyor yani ogrenciKrediManager da 1.10 yapamıyorsun.
        return tutar * 1.18;
    }
}
