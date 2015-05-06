package com.example;
/**
 * Created by Shellshok on 06/05/2015.
 */
public class Principal {

    public static void main(String[] args){
        GeoPunto a;
        GeoPunto b;

        a = new GeoPunto(10,40);
        b = new GeoPunto(11,39);
        a.distancia(b);
        System.out.println(a.distancia(b));


    }
}
