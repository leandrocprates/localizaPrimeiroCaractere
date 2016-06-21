/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ariane
 */
public class Lentrada  implements  Stream{

    private String stringEntreda =null; 
    
    //indice minimo onde comeca a leitura
    private int indexMin=0;
    //indice maximo onde termina a leitura
    private int indexMax=0;
    
    
    @Override
    public char getNext() {
        return stringEntreda.charAt(indexMin++);
    }

    @Override
    public boolean hasNext() {
        if (indexMin < indexMax ){
            return true;
        }
        return false;
    }

    public void leEntrada(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a string de entrada : "  );
        
        stringEntreda = sc.next(); 
        
        indexMax = stringEntreda.length();
    }
    
    public char firstChar(){
    
        LinkedHashMap mapCaractereQuantidade = new LinkedHashMap<String,Integer>();
        
        char caractere = '0';
        char caractereRetorno = ' ';
        
        Integer quantidade=null;
        
        while ( hasNext() ){
            
            caractere = getNext();
            
            System.out.println("Caractere: " +caractere);
            
            quantidade = (Integer) mapCaractereQuantidade.get(String.valueOf(caractere)) ; 
            
            if ( quantidade == null ){
                mapCaractereQuantidade.put(String.valueOf(caractere), 1);
            } else {
                quantidade++;
                mapCaractereQuantidade.put(String.valueOf(caractere), quantidade); 
            }
            
        }
        
        Set<Map.Entry<String,Integer>> mapSet = mapCaractereQuantidade.entrySet();
        Iterator<Map.Entry<String,Integer>> it = mapSet.iterator();
        
        while(it.hasNext()){
            Map.Entry<String,Integer>  entry = it.next();
            System.out.println( "Chave: "+entry.getKey() +" , Valor: "+entry.getValue() ) ;
            
            if ( entry.getValue() ==1 ){
                caractereRetorno = entry.getKey().toCharArray()[0] ; 
                break;
            }
            
        }
        
        return caractereRetorno; 
    }
    
    

    
}
