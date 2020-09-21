public class Calculator{
    

    private int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    private int substr(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private int mult(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    private float divide(int firstNum, int secondNum) {
        if(secondNum != 0) {
            return (float)firstNum / secondNum;
        }else{
            System.out.println("На 0 делить нельзя");
            return 0;
        }  
    }

    private int pow(int firstNum, int secondNum) {
        int ResPow = 1;
        for (int i = 0; i < secondNum; i++){                  
            ResPow *= firstNum;
        }
        return ResPow;
    }

    private int mod(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

    public void calculate(int FirstNum, String Operation, int SecondNum) {
        switch (Operation) {
            case "+":
                System.out.println(add(FirstNum,SecondNum));
                break;
            case "-":
                System.out.println(substr(FirstNum,SecondNum));
                break;
            case "*":
                System.out.println(mult(FirstNum,SecondNum));
                break;
            case "/":
                System.out.println(divide(FirstNum,SecondNum));
                break;
            case "^":
                System.out.println(pow(FirstNum,SecondNum));
                break;
            case "%":
                System.out.println(mod(FirstNum,SecondNum));
                break;                
            default:
                break;
        }
    }

}