public class BankAccount {
    OwnerProfile ownerProfile;
    float balance;
    String currency;
    String accountType;

    // Alright. So now i will write the basic code for adding money to the account

    public void deposit(float amount) {
        if (amount > 0) { 
            balance += amount; //if the moeny they are adding is greater than 0 than add that money to the balance
        } else {
            System.out.println("Invalid amount. Please enter a positive value."); //otherwise give an error message
        }
    }

    // Writing the code for withdrawing moeny
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) { //Took time to figure out the control flow of this '&&' statement
            balance -= amount;
        } else {
            System.out.println("Invalid amount. Please enter a positive value less than or equal to the current balance.");
        }
    }
    // Save the file. or else scratch your head for 2 hours
    // Missed a curly here. Used AI to figure it out.
}
