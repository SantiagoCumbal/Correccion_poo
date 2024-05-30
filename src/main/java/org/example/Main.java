package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //5 instancias
        Hoteles miHotel1 = new  Hoteles("Quito-Carcelen", "54DB60A",7,"La Colina",123);
        Hoteles miHotel2 = new  Hoteles("Quito-La Marín", "78A56TR",6,"La Orellana",100);
        Hoteles miHotel3 = new  Hoteles("Quito-Tumbaco", "90DF765",5,"El Oasis",82);
        Hoteles miHotel4 = new  Hoteles("Quito-Cumbaya", "FGV4532",4,"La Armenia",70);
        Hoteles miHotel5 = new  Hoteles("Quito-Iñaquito", "UVC7654",7,"Los Pioneros",123);
        //Objetos con Valores Null
        Hoteles miHotel6 = new Hoteles();
        Hoteles miHotel = new Hoteles();

        //Imprimir datos
        miHotel.imprimirDatos();
        miHotel1.imprimirDatos();
        miHotel2.imprimirDatos();

        //Modificar datos
        miHotel1.modificarDatos("Nuevo Paraiso", "567289AK", "Quito-La Floresta", 10, 200);
        miHotel1.modificarDatos("La secta", "0976TRF4", "Quito-La Carolina", 3, 57);
        miHotel1.modificarDatos("Nueva Bancada", "76FE54KJ", "Quito-Guamani", 4, 56);

        //Mostrar modificacion
        miHotel1.imprimirDatos();
        miHotel2.imprimirDatos();
        miHotel3.imprimirDatos();


        //Modificar datos a null
        miHotel4.modificarDatos2();
        miHotel5.modificarDatos2();

        //Mostrar datos Modificados de null
        miHotel4.imprimirDatos();
        miHotel5.imprimirDatos();




    }
}