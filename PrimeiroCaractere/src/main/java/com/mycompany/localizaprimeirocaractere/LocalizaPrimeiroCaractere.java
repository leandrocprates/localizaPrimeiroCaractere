/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.localizaprimeirocaractere;

import com.mycompany.interf.Lentrada;
import java.util.Scanner;

/**
 * Classe principal entrada: aAbBABac 
 * @author ariane
 */
public class LocalizaPrimeiroCaractere {
    
    public static void main(String args[]){
        
        
        Lentrada entrada = new Lentrada();
        char caractereRetorno=' ';

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a string de entrada : "  );
        
        String stringEntrada = sc.next(); 

        
        entrada.leEntrada(stringEntrada);
        
        caractereRetorno = entrada.firstChar();
        
        if ( caractereRetorno != ' ' ){
            System.out.println("O caractere [" + caractereRetorno +"] é o primeiro caractre que aparece e nao se repete. ");
        } else {
            System.out.println("Nao existe nenhum caractere que aparece somente uma vez no texto digitado.");
        }
        
    }
    
}



