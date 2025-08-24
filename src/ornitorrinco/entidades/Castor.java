
package ornitorrinco.entidades;

public abstract class Castor {
    protected double nadar;
    protected double cola;

    public Castor(double nadar, double cola) {
        this.nadar = nadar;
        this.cola = cola;
    }

    public double getNadar() {
        return nadar;
    }

    public double getCola() {
        return cola;
    }
    public abstract void nadar();
    public abstract void tocarGuitarra();
    
}
