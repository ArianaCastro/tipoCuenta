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
public class cntaCorriente extends tipoCuenta{
    private double cupo;

    public cntaCorriente(int id) {
        super(id);
    }

    public cntaCorriente() {
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }
    
    
     @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println(" ------------> POSEE UNA CUENTA CORRIENTE");
    }
}
