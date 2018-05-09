/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maarchyl
 */
public class Main {

    public static void main(String[] args) {
   
    List<Object> lista = new ArrayList<Object>();
    Auto a1= new Auto("Fiat","Uno",180,1000);
    Auto a2= new Auto("Opel","Astra",190,10000);
    Auto a3= new Auto("Mazda","6",200,17000);
    Auto a4= new Auto("Mercedes","123",300,100000);
    lista.add(a1);
    lista.add(a2);
    lista.add(a3);
    lista.add(a4);
    
    for (int i=0; i<lista.size();i++){
        System.out.println("lista"+(i+1)+":"+lista.get(i).toString());
    }
    
    }
}

