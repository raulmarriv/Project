/*
Autor: Raul Martos
Fecha: 04/02/2020
pide el dni (solo numeros) y decir cual es la letra
*/
package projectgit;


import java.util.Scanner;



public class ProjectGit {

    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        //preguntar dni
        int dni = keyboard.nextInt();
        char letter = DNIletter(dni);
        System.out.println(""+dni + letter);
    }
    
    //function que recibe dni y devuelve la letra
    private static char DNIletter(int dni){
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE"; 
        int res = dni % 23; 
        char letter = letters.charAt(res);
        return letter;
    }
    
}