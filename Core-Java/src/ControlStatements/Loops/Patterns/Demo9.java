package ControlStatements.Loops.Patterns;

public class Demo9 {
    public static void main(String[] args) {
        for (int row =5 ;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(col%2==0?"0 ":"1 ");
            }
            System.out.println();
        }
    }
}
