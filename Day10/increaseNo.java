package Day9;

public class increaseNo {
    public static void main(String[] args) {

        String amt = "$2000";


        String Part = amt.substring(1);


        int Value = Integer.parseInt(Part) + 1;
        String newAmt = "$" + Value;

        System.out.println("The updated amount is: " + newAmt);
    }
}
