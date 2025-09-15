/*el problema estaba en que todo lo del String.format estaba dentro de comillas es decir String.format("<=%s=>, frase") y
la manera correcta es que la variable debe estar fuera y separados por comas
*/
String adornar(String frase){
    return String.format("<=%s=>", frase);}
adornar("Hola amigos");