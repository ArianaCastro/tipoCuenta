/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationdeber;

import TipodeCuenta.cntaCorriente;
import TipodeCuenta.cntaJovenes;
import TipodeCuenta.cntaKids;
import TipodeCuenta.cntasMayores;
import TipodeCuenta.tipoCuenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author arist
 */
public class JavaApplicationDeber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         cntaKids ck1=new cntaKids(50);
        ck1.setApellido("Isabella");
        ck1.setNombre("Zambrano");
        ck1.setEdad(15);
        cntaJovenes cj1=new cntaJovenes(100);
        cj1.setApellido("Casarez");
        cj1.setNombre("Marlon");
        cj1.setEdad(20);
        cntasMayores cm1=new cntasMayores(150);
        cm1.setApellido("Rodriguez");
        cm1.setNombre("Matilde");
        cm1.setEdad(65);
        cntaCorriente cC1=new cntaCorriente(2000);
        cC1.setApellido("Paredes");
        cC1.setNombre("Juan");
        cC1.setEdad(23);
        
        List<tipoCuenta> tipocnta = new ArrayList<>();
       tipocnta.add(ck1);
        tipocnta.add(cj1);
        tipocnta.add(cm1);
        tipocnta.add(cC1);
        
        tipocnta.forEach((tipoCnta) -> {
            tipoCnta.Mostrar();
        });
            
    Scanner s= new Scanner(System.in);
    
    s.nextLine();
    
    }
    
    }
    
