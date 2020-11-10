package com.ivanfaathirza.energikinetik;

public class EnergiKinetik {
    private double massa, volume;

    public EnergiKinetik(double massa, double volume){
        this.massa = massa;
        this.volume = volume;
    }

    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double hitung(){
        return 0.5 * massa / 1000 * Math.pow(volume, 2);
    }
}
