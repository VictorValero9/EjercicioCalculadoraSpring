package es.neesis.annotations.services;

import org.springframework.stereotype.Service;
import java.util.Scanner;
@Service
public class Calculadora implements ICalculadora{
    @Override
    public void testFunction(){
        System.out.println("Test");
    }

    @Override
    public void menu(){
        System.out.println("Bienvenido a la calculadora, selecciona una opción: ");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");

        int option = selectOption();
    }

    public int selectOption(){
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();

        return option;
    }


    private float sumar(float factor1, float factor2){
        return factor1 + factor2;
    }

    private float restar(float factor1, float factor2){
        return factor1 - factor2;
    }

    private float multiplicar(float factor1, float factor2){
        return factor1 * factor2;
    }

    private float dividir(float factor1, float factor2){
        return factor1 / factor2;
    }



}
