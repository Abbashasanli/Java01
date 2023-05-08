package homeworks.lesson27;

public class GenericApp {
    public static void main(String[] args) {
        Box<Integer> resultBox = GenerateRandom();
        System.out.println(resultBox.getData());
        System.out.println(resultBox.isEven());

    }
    public static Box<Integer> GenerateRandom(){
        int num = (int) (Math.random() * 100);
        boolean isEven = num % 2 == 0;
        return new Box<>(isEven,num);

    }
}
