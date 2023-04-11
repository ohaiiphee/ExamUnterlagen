package LastYearsExam;
public class Rekursion {

    public static int multiplicate(int number1, int number2){
        if(number2 <= 1)
        {
            return number1;
        }
        return number1 + multiplicate(number1, --number2);
    }

    public static void main(String[] args) {
        System.out.println(multiplicate(4, 4));
        System.out.println(multiplicate(5, 3));
    }

}

//public class MultiplicationDemoApp {
//
//    public static int multiplicate(int number1, int number2){
//        return 0; // TODO: IMPLEMENT ME
//    }
//
//
//}
