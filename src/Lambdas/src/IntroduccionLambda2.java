
/*Las funciones lambda no permiten modificar variables locales, pero si variables goblales. */
public class IntroduccionLambda2 {
    int numeroGlobal = 1;
    public int sumNegativaVarLocal(){
        /*final*/ int numeroLocal = 1;    //Colocarle o no el final es opcional.
        Suma s = (a, b) -> {
            int menos_uno = numeroLocal*-1; //Las lambdas solamente pueden usarlas mas no alterar su valor
            //numeroLocal *= -1;  //Para las lambdas las variables locales se comportan como final. Indicarlo directamente en la var es opcional
            return (a + b) * menos_uno;
        };
        return s.suma(2,3);
    }
    public int sumNegativaVarGlobales(){
        Suma s = (a, b) -> {
            numeroGlobal *= -2;     //La var global numeroGlobal si puede ser modificada y usada en la expresion lambda.
            return (a + b) * numeroGlobal;
        };
        return s.suma(2,3);
    }

    public static void main(String[] args) {
        IntroduccionLambda2 il = new IntroduccionLambda2();
        System.out.println(il.sumNegativaVarLocal());
        System.out.println(il.sumNegativaVarGlobales());
    }
}

/*Las expresiones lambda se comportan en cuanto a la utilizacion y modificacion de variables tal como las clases anonimas. */