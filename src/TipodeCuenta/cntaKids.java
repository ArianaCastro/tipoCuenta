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
public class cntaKids extends ctaAhorro{
    private String formaFirma;

    public cntaKids(int id) {
        super(id);
    }

    public cntaKids() {
    }

    public String getFormaFirma() {
        return formaFirma;
    }

    public void setFormaFirma(String formaFirma) {
        this.formaFirma = formaFirma;
    }

    
    
     @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println(" ------------> POSEE UNA CUENTA DE AHORROS KIDS");
    }  
    
}
