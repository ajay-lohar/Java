package ControlStatements.Loops;

public class Demo5Factorial {
    public static void main(String[] args) {
        int number = 6;
        int fact = 1;
        for(int i = 1 ;i<=number ;i++){
//         fact = fact * i;                line nuber 8 & 9 both are same
           fact*= i;
        }
        System.out.println(fact);
    }
}

//output :-
//720