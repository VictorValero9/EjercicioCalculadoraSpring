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
        while (true)
        {
            System.out.println("Bienvenido a la calculadora, selecciona una opción: ");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");

           int option = selectOption();
            if (option >= 5 || option < 1){
                break;
            }
            System.out.println("Introduce el primer operador: ");
            float operator1 = selectOperator();
            System.out.println("Introduce el segundo operador: ");
            float operator2 = selectOperator();

            float result = calculate(option, operator1, operator2);
            System.out.println("El resultado es: " + result);
        }

        System.out.println("Finalizando calculadora...");
    }

    public int selectOption(){
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();

        return option;
    }

    public float selectOperator(){
        Scanner input = new Scanner(System.in);
        float operator = input.nextFloat();
        input.nextLine();

        return operator;
    }

    public float calculate(int option, float operator1, float operator2){
        float result;
        switch (option){
            case 1: {
                result = addOperation(operator1, operator2);
                break;
            }
            case 2: {
                result = minusOperation(operator1, operator2);
                break;
            }
            case 3: {
                result = multiplyOperation(operator1, operator2);
                break;
            }
            case 4:{
                result = divideOperation(operator1, operator2);
                break;
            }
            default:{
                result = 0;

            }

        }
        return result;
    }

    private float addOperation(float factor1, float factor2){
        return factor1 + factor2;
    }

    private float minusOperation(float factor1, float factor2){
        return factor1 - factor2;
    }

    private float multiplyOperation(float factor1, float factor2){
        return factor1 * factor2;
    }

    private float divideOperation(float factor1, float factor2){
        return factor1 / factor2;
    }



}
