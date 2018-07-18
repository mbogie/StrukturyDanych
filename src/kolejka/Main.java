package kolejka;

public class Main {
    public static void main(String[] args) {

        Kolejka kolejka = new Kolejka();

        kolejka.push(20);
        kolejka.push(5);
        kolejka.push(611);
        kolejka.push(12);

        while(!kolejka.isEmpty()){
            System.out.println(kolejka.pop());
        }

        System.out.println(kolejka.peek());
    }
}
