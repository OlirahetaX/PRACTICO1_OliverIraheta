package com.practico1_oliveriraheta;

import java.util.Scanner;
public class Practico1_OliverIraheta {

    public static void main(String[] args) {
        Scanner vini= new Scanner(System.in);
        Scanner rm= new Scanner(System.in);
        boolean menu = true;
        
        while(menu==true){
            System.out.println("1. Ejercicio de palabras    2. Salir");
            System.out.println("Ingrese Opcion");
            int opc= vini.nextInt();
            if(opc==1){
                System.out.println("Ingrese cadena 1");
                String cad1 = rm.nextLine();
                System.out.println("Ingrese cadena 2");
                String cad2 = rm.nextLine();
                System.out.println("cadena resultante: "+palabra(cad1,cad2));
            }else if(opc==2){
                System.out.println("Adios");
                menu=false;
            }else{
                System.out.println("Ingrese Una Opcion Valida");
            }
        }
    }

    public static String palabra(String cad1, String cad2) {
        String palabra= "";
        
        
        if(cad1.equals(cad2)){
            for(int j=cad1.length()-1; j>=0; j--){
                cad1 += cad1.charAt(j);
            }
          palabra= cad1; 
            
        }else if(cad1.length()==cad2.length()){
            for(int i=0; i<=cad2.length()-1; i++){
                palabra+= cad1.charAt(i)+""+cad2.charAt(i);       
            }
        }else{
        palabra = cad1+cad2;
            }    
        
        return palabra;
}
}


