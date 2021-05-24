package exerc1;

public class Main {

    public static void main(String[] args) {
        Pessoa[] arr =  new Pessoa[10];

        Pessoa p0 = new Pessoa("Juan", "00000000");
        Pessoa p1 = new Pessoa("Pedro", "44444444");
        Pessoa p2 = new Pessoa("Ramon", "11111111");
        Pessoa p3 = new Pessoa("Marcos", "55555555");
        Pessoa p4 = new Pessoa("Brian", "22222222");
        Pessoa p5 = new Pessoa("Maria", "33333333");
        Pessoa p6 = new Pessoa("Victoria", "99999999");
        Pessoa p7 = new Pessoa("Elena", "6666666");
        Pessoa p8 = new Pessoa("Natalia", "7777777");
        Pessoa p9 = new Pessoa("Juana", "88888888");

        arr[0] = p0;
        arr[1] = p1;
        arr[2] = p2;
        arr[3] = p3;
        arr[4] = p4;
        arr[5] = p5;
        arr[6] = p6;
        arr[7] = p7;
        arr[8] = p8;
        arr[9] = p9;

        BubbleSort.sort(arr);

        for (Pessoa p:arr) {
            System.out.println(p);
        }
    }
}
