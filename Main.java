package sentencias;

public class Main {
    public static void main(String [] args){
        //• En primer lugar debe crear un StringBuilder con la cadena
        // “Hay coches” y debe mostrarla por consola
        StringBuilder sb1 = new StringBuilder("Hay coches");
        System.out.println("StringBuilder = " + sb1);
//        • También debe de mostrar por consola su capacidad y longitud.
        System.out.println("capacidad " + sb1.capacity());
        System.out.println(" longitud " + sb1.length());
//        • Aprovechando la cadena anterior (“Hay coches”) y usando los métodos de StringBuilder se debe modificar la cadena para que
//pase a ser “Hay coches en el desguace” y mostrarla después por consola.
        sb1.append(" en el desguace");
        System.out.println(sb1);
//        • De nuevo aprovecharemos la cadena anterior para modificarla usando los métodos de StringBuilder y que pase a ser “Hay más
//de 1000 coches en el desguace” y mostrarlo por consola. El número 1000 debe estar previamente almacenado en un int
        int mil = 1000;
        sb1.insert(4,"mas de ");
        sb1.insert(11,mil);
        sb1.insert(15," ");
        System.out.println(sb1);
//        • Se debe almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola

        String sb2 = sb1.substring(33,37);
        System.out.println(sb2);
//        • Mostrar por consola la capacidad y longitud del StringBuilder final.
        System.out.println("capacidad " + sb1.capacity());
        System.out.println("longitud " + sb1.length());
        StringBuffer sbuf = new StringBuffer("hay coches ");
        System.out.println("StringBuffer = " + sbuf);
        // capacidad y longitud
        System.out.println(sbuf.capacity());
        System.out.println(sbuf.length());
        // se muta el stringbuffer
        sbuf.append("em el desguace ");
        System.out.println(sbuf);
        // ahora le sumamos el int
        sbuf.insert(4,"mas de ");
        sbuf.insert(11,mil);
        sbuf.insert(15," ");
        System.out.println(sbuf);
        // imprimimos capacidad y longitud terminado
        System.out.println("capacidad "+sbuf.capacity());
        System.out.println("longitud "+sbuf.length());
    }
}
