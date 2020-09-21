public class Calculator{
    public static void main(String[] args) {

        float FirstNum = 3;
        float SecondNum = 3;
        char Operation = '^';

        if(Operation == '+'){
            System.out.println(FirstNum + SecondNum);
        }else if (Operation == '-'){
            System.out.println(FirstNum - SecondNum);
        }else if (Operation == '*'){
            System.out.println(FirstNum * SecondNum);
        }else if (Operation == '/'){
            float ResDiv = FirstNum / SecondNum;
            System.out.println(ResDiv);
        }else if (Operation == '^'){
            float ResPow = 1;
            for (int i = 0; i <= SecondNum; i++){                  
                ResPow *= FirstNum;
            }
            System.out.println(ResPow);
        }else {
            System.out.println(FirstNum % SecondNum);
        }

    }
}