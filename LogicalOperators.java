public class LogicalOperators {
    public static void main(String[] args) {
        // int grade = 11;
        // if(!(grade == 10 || grade == 12)) {         // Logical NOT and OR operators are used here
        //     System.out.println("You can give the board exams now.");
        // }
        // else {
        // System.out.println("You cannot give the board exams.");





        int n1 = 11, n2 = 10, n3 = 5;
        int res = 0;
        res = n1>n2 ? n1>n3 ? n1:n3 : n2>n3 ? n2:n3;
        //    if     nested if              
        System.out.println(res);
        
    }
}
