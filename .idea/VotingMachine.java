package week_3;
//3
//import java.util.Locale;
//import java.util.Scanner;
//
//public class VotingMachine {
//    public String vote;
//    public int countLabourVote;
//    public int countConservativeVote;
//
//    public Scanner input = new Scanner(System.in);
//
//    public String getVote(){
//        this.vote=input.next();
//        this.vote=vote.toUpperCase();
//        System.out.println(this.vote);
//        return vote;
//    }
//
//    public void print(){
//        System.out.print(" Enter [ A ] to vote for a Labour party\n"+
//                " Enter [ B ] to vote for a Conservative party\n");
//    }
//
//    public void checkData(String input){
//         if (input.equals("A")){
//             System.out.println("You successfully vote for Labours party");
//             this.countLabourVote++;
//         }
//         else if (input.equals("B")){
//             System.out.println("You successfully vote for Conservative party");
//             this.countConservativeVote++;
//         }
//    }
//    public void displayResult(){
//
//        System.out.print("Labour votes : ");
//        System.out.println(this.countLabourVote);
//        System.out.print("Conservative votes : ");
//        System.out.println(this.countConservativeVote);
//
//    }
//}
//
//class VoteDisplay {
//
//
//    public static void main(String[] args) {
//        System.out.println(" Vote is open now ...........! ");
//        Boolean value=true;
//
//        VotingMachine in = new VotingMachine();
//        while(value){
//            in.print();
//            String data = in.getVote();
//            in.checkData(data);
//            in.displayResult();
//                System.out.println("If you want to quit Enter [ Q ] or press any key to continue");
//                String nextCustomer =in.input.next();
//                    if(nextCustomer.equals("Q")){
//                        value=false;
//                        System.out.println("Exit from programme..!");
//                    }
//                    else {
//                        value=true;
//                    }
//        }
//    }
//}



//part 2

import java.util.Locale;
import java.util.Scanner;

public class VotingMachine<Public> {
    public String vote;
    public int countLabourVote;
    public int countConservativeVote;

    public Scanner input = new Scanner(System.in);

    public String getVote(){
        this.vote=input.next();
        this.vote=vote.toUpperCase();
        System.out.println(this.vote);
        return vote;
    }

    public void print(){
        System.out.print(" Enter [ A ] to vote for a Labour party\n"+
                " Enter [ B ] to vote for a Conservative party\n");
    }

    public void checkData(String input){
        if (input.equals("A")){
            System.out.println("You successfully vote for Labours party");
            this.countLabourVote++;
        }
        else if (input.equals("B")){
            System.out.println("You successfully vote for Conservative party");
            this.countConservativeVote++;
        }
    }
    public void displayResult(){

        System.out.print("Labour votes : ");
        this.countLabourVote = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(this.countLabourVote);
        System.out.print("Conservative votes : ");
        this.countConservativeVote = 0;
        System.out.println(this.countConservativeVote);
    }


     static void vote() {
        Boolean value=true;
        VotingMachine in = new VotingMachine();
        while(value){
            in.print();
            String data = in.getVote();
            in.checkData(data);
            System.out.println("If you want to quit Enter [ Q ] or press any key to continue");
            String nextCustomer =in.input.next();
            if(nextCustomer.equals("Q")){
                value=false;
                System.out.println("Exit from programme..!");
                in.displayResult();
            }
            else {
                value = true;
            }
        }
}
    public static void main(String[] args) {
        System.out.println(" Vote is open now ...........! ");
        VotingMachine.vote();
        }
    }
