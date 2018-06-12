/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipodeCuenta;

/**
 *
 * @author arist
 */
public abstract class ctaAhorro extends tipoCuenta {
    private double montoTotal;

    public ctaAhorro(int id) {
        super(id);
    }

    public ctaAhorro() {
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
    
}
