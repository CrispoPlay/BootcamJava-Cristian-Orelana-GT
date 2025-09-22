//El error es que esta escrito "return número > 0 && < 20" y deberia ser comprobando 2 veces la variable numero ya que solo se comprueba 1 vez
boolean positivoMenor20(int numero){
    return numero > 0 && numero < 20;
}
positivoMenor20(5);
positivoMenor20(40);