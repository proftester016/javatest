public class NewTestingClassPrintSwitchStatement {
}
//output will be Ans.- v wxyz xyz yz z


class NewTestingClass3{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i=0;i<5;i++) {
            switch(i)
            {
                case 0: System.out.println("v");
                    break;
                case 1: System.out.println("w");
                case 2: System.out.println("x");
                case 3: System.out.println("y");
                case 4: System.out.println("z");break;
            }
        }
    }
}

