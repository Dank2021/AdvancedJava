package javaA.gen.genericosII;

public class Clase <K,T,V,E> {  //Se pueden colocar varios genericos, segun se necesiten
    K objK;
    T objT;
    V objV;
    E objE;
    public Clase(K obj, T obj1, V obj2, E obj3) {
        this.objK = obj;
        this.objT = obj1;
        this.objV = obj2;
        this.objE = obj3;
    }

    public void classType() {

        System.out.println("El K es tipo: " + objK.getClass().getName());
        System.out.println("El T es tipo: " + objT.getClass().getName());
        System.out.println("El V es tipo: " + objV.getClass().getName());
        System.out.println("El E es tipo: " + objE.getClass().getName());
    }
}
