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
public class cntasMayores extends ctaAhorro{
    private String jubilacion;

    public cntasMayores(int id) {
        super(id);
    }

    public cntasMayores() {
    }

    public String getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(String jubilacion) {
        this.jubilacion = jubilacion;
    }

    @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println(" ------------> POSEE UNA CUENTA DE AHORROS MAYORES");
    }  
    
    
}
