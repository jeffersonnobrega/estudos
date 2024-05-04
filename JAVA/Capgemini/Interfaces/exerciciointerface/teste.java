/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class teste {
    public static void main(String args[]) {

int op, acumulador = 0;

op = 0;

while (op < 9) {

 

++op;

switch(op%3) {

case 1:

acumulador += op;

case 2:

acumulador -= op;

break;

default:

continue;

}

acumulador += op;

}

System.out.println (acumulador);

}
}
