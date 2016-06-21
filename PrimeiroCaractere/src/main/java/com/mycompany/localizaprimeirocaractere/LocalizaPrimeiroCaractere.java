/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.localizaprimeirocaractere;

import com.mycompany.interf.Lentrada;

/**
 * Classe principal entrada: aAbBABac 
 * @author ariane
 */
public class LocalizaPrimeiroCaractere {
    
    public static void main(String args[]){
        
        Lentrada entrada = new Lentrada();
        char caractereRetorno=' ';
        
        entrada.leEntrada();
        
        caractereRetorno = entrada.firstChar();
        
        System.out.println("O caractere [" + caractereRetorno +"] é o primeiro caractre que aparece e nao se repete. ");
        
    }
    
}



