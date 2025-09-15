/*
El problema estaba bien redactado, estaba todo correcto a excepcion del orden de s1 y s2 en el String.format
Ya que en el ejercicio estaba escrito como String concatenar(String s1,String s2) y en el String.format("[%s+%s]", s2, s1)
por lo que eso afectaba en el orden de la concatenacion
 */

concatenar("Hola","Mundo");
String concatenar(String palabra1, String palabra2){
    return String.format("[%s+%s]", palabra1, palabra2);}