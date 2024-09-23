package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Licor licorUno = new Licor();
        Licor licorDos = new Licor("Aguardiente antioqueño tapa verde","aguardiente","FLA", LocalDate.of(2024,10,31),29.0);

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("JUAN","1017170603","calle 25 sur # 42b-14 torre4 apto 1315",35,"juan@gmail.com");

        //Accediendo a los atributos}
        System.out.println(licorUno.getNombres());
        System.out.println(licorDos.getNombres());
    }

}