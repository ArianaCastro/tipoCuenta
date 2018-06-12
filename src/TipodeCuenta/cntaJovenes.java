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
public class cntaJovenes extends ctaAhorro{
   private String estadoCivil;

    public cntaJovenes(int id) {
        super(id);
    }

    public cntaJovenes() {
    }
   
   

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
   
 @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println(" ------------> POSEE UNA CUENTA DE AHORROS JOVENES");
    }     
    
}
