public class logicOperations {
    public static void main(String[] args) {


        int a = 8;
        int b = 5;

        //Operadores de asignacion
        System.out.println("a igual a b ->" + (a == b));
        System.out.println("a diferente a b ->" + (a != b));

        //operadores Relacionales
        System.out.println("a es mayor que b? -> " + (a > b));
        System.out.println("a es menor que b? -> " + (a < b));
        System.out.println("a es mayor que b? -> " + (a >= b));
        System.out.println("a es menor que b? -> " + (a <= b));
        
        if(a == a){
            System.out.println("a igual a b");
        } else if (a != b) {
            System.out.println("a diferente a b");
        } else if (a > b) {
            System.out.println("a mayor a b");
        } else if (a < b) {
            System.out.println("a menor a b");
        } else if (a >= b) {
            System.out.println("a mayor o igual  a b");
        } else if (a <= b) {
            System.out.println("a menor o igual a b");
        }
    }
}
