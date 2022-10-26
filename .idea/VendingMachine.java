package week_3;

//1
public class VendingMachine {
    private int cans ;
    private int tokenCount ;
    VendingMachine(){
        this.cans=10;
        this.tokenCount=0;
    }

//    VendingMachine(int canStart){
//        this.cans+= canStart;
//        this.tokenCount=0;
//
//    }


    public  void  fillUp(int cans)
    {

        this.cans= this.cans+cans;
        tokenCount=0;

    }
    public  void  insertToken()
    {

        //check the value of tokens.
        if (cans==0 ){
            System.out.print("Token count = ");
            System.out.print(getTokenCount());
            System.out.println(" No any cans to get ");

        }else   {
            System.out.println("You can get a can, Here it is .......");
            this.cans--;
            tokenCount++;

        }
    }

    public int getTokenCount() {

        return cans;

    }

    public int getCanCount() {

        return tokenCount;
    }
}
