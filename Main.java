public class Main {
    public static void main(String[] args) {
        // Step 1. So now I will create an address object folowing the following format: class(where will this data comefrom from the exisiting classes that uyou have created + what is the name of the variable = oject where the value will be actially stored
        Address myAddress1 = new Address();

        // Step 2. Now I will set the values of the address object. I need to ensure that the vlaue mentiond here are the same that are mentioned in the address class as well.
        myAddress1.street = "123 Main Street";
        myAddress1.city = "New York";
        myAddress1.state = "NY";
        myAddress1.country = "USA";
        myAddress1.postalCode = "10001";
        
        //Print to see if stuff is working
        System.out.println("Street: " + myAddress1.street);
        System.out.println("City: " + myAddress1.city);
        System.out.println("State: " + myAddress1.state);
        System.out.println("Country: " + myAddress1.country);
        System.out.println("Postal Code: "+ myAddress1.postalCode);


        // Step 3. Now I will create a contact information object. The contact information details have been put in the contact information class/ java file
        ContactInformation myContactInformation1 = new ContactInformation();

        // Step 4.Assigning values to the contact information object

        myContactInformation1.phone = "123-456-7890";
        myContactInformation1.email = "tryingJava@bluaaaahh.com";

        // Lets print out the stuff to se wheather it works on not. 

        System.out.println("Phone: " + myContactInformation1.phone);
        System.out.println("Email: " + myContactInformation1.email);

        //Ok. so i guess we move on to the owner profile now. need to create an object, assign it value and ensure that the same has been done in the owner proile file

        OwnerProfile myOwnerProfile1 = new OwnerProfile();
        myOwnerProfile1.Name = "Aasi Kaleem";
        myOwnerProfile1.ownertype = "Individual";
        myOwnerProfile1.address = myAddress1;
        myOwnerProfile1.contactInformation = myContactInformation1;


        //Print to see if the stuff is working

        System.out.println("Name: " + myOwnerProfile1.Name);
        System.out.println("Owner Type: " + myOwnerProfile1.ownertype);
        System.out.println("Address: " + myOwnerProfile1.address.street + ", " + myOwnerProfile1.address.city + ", " + myOwnerProfile1.address.state + ", " + myOwnerProfile1.address.country + ", " + myOwnerProfile1.address.postalCode); // Wrote this line with the help of AI
        System.out.println("Phone: " + myOwnerProfile1.contactInformation.phone); //haha. it works. Its Alive

        //Move on to the bank account now.
        BankAccount myBankAccount1 = new BankAccount();
        myBankAccount1.ownerProfile = myOwnerProfile1;
        myBankAccount1.currency = "USD";
        myBankAccount1.accountType = "Checking";
        myBankAccount1.balance = 1000;

        //Print to see if the stuff is working

        System.out.println("\nBank Account Details:");
        System.out.println("Owner: " + myBankAccount1.ownerProfile.Name);
        System.out.println("Account Type: " + myBankAccount1.accountType);
        System.out.println("Currency: " + myBankAccount1.currency);
        System.out.println("Starting Balance: " + myBankAccount1.balance + " " + myBankAccount1.currency);

        // Deposit example
        System.out.println("\nPerforming a deposit...");
        myBankAccount1.deposit(200.0f); // Deposit 200

        // Withdraw example
        System.out.println("\nPerforming a withdrawal...");
        myBankAccount1.withdraw(100.0f); // Withdraw 100

        // Try to withdraw more than available balance
        System.out.println("\nTrying to withdraw more than available balance...");
        myBankAccount1.withdraw(1200.0f); // Trying to withdraw more than balance

        Address myAddress2 = new Address();
        myAddress2.street = "456 Elm Street";
        myAddress2.city = "Los Angeles";
        myAddress2.state = "CA";
        myAddress2.country = "USA";
        myAddress2.postalCode = "90001";

        ContactInformation myContactInformation2 = new ContactInformation();
        myContactInformation2.phone = "987-654-3210";
        myContactInformation2.email = "owner2@example.com";

        OwnerProfile myOwnerProfile2 = new OwnerProfile();
        myOwnerProfile2.Name = "Jane Smith";
        myOwnerProfile2.ownertype = "Individual";
        myOwnerProfile2.address = myAddress2;
        myOwnerProfile2.contactInformation = myContactInformation2;

        // Create BankAccount object for the second owner
        BankAccount myBankAccount2 = new BankAccount();
        myBankAccount2.ownerProfile = myOwnerProfile2;
        myBankAccount2.currency = "USD";
        myBankAccount2.accountType = "Savings";
        myBankAccount2.balance = 2000;

        // Print details for the second bank account
        System.out.println("\nBank Account 2 Details:");
        System.out.println("Owner: " + myBankAccount2.ownerProfile.Name);
        System.out.println("Account Type: " + myBankAccount2.accountType);
        System.out.println("Currency: " + myBankAccount2.currency);
        System.out.println("Starting Balance: " + myBankAccount2.balance);
        System.out.println("Owner Address: " + myBankAccount2.ownerProfile.address.street + ", " +
                myBankAccount2.ownerProfile.address.city + ", " + myBankAccount2.ownerProfile.address.state +
                ", " + myBankAccount2.ownerProfile.address.country + ", " + myBankAccount2.ownerProfile.address.postalCode);
        System.out.println("Phone: " + myBankAccount2.ownerProfile.contactInformation.phone);
        System.out.println("Email: " + myBankAccount2.ownerProfile.contactInformation.email);

        // Create Address and ContactInformation objects for the third owner
        Address myAddress3 = new Address();
        myAddress3.street = "789 Pine Street";
        myAddress3.city = "Chicago";
        myAddress3.state = "IL";
        myAddress3.country = "USA";
        myAddress3.postalCode = "60007";

        ContactInformation myContactInformation3 = new ContactInformation();
        myContactInformation3.phone = "555-123-4567";
        myContactInformation3.email = "owner3@example.com";

        OwnerProfile myOwnerProfile3 = new OwnerProfile();
        myOwnerProfile3.Name = "Michael Johnson";
        myOwnerProfile3.ownertype = "Company";
        myOwnerProfile3.address = myAddress3;
        myOwnerProfile3.contactInformation = myContactInformation3;

        // Create BankAccount object for the third owner
        BankAccount myBankAccount3 = new BankAccount();
        myBankAccount3.ownerProfile = myOwnerProfile3;
        myBankAccount3.currency = "USD";
        myBankAccount3.accountType = "Business";
        myBankAccount3.balance = 50000;

        // Print details for the third bank account
        System.out.println("\nBank Account 3 Details:");
        System.out.println("Owner: " + myBankAccount3.ownerProfile.Name);
        System.out.println("Account Type: " + myBankAccount3.accountType);
        System.out.println("Currency: " + myBankAccount3.currency);
        System.out.println("Starting Balance: " + myBankAccount3.balance);
        System.out.println("Owner Address: " + myBankAccount3.ownerProfile.address.street + ", " +
                myBankAccount3.ownerProfile.address.city + ", " + myBankAccount3.ownerProfile.address.state +
                ", " + myBankAccount3.ownerProfile.address.country + ", " + myBankAccount3.ownerProfile.address.postalCode);
        System.out.println("Phone: " + myBankAccount3.ownerProfile.contactInformation.phone);
        System.out.println("Email: " + myBankAccount3.ownerProfile.contactInformation.email);

        // for second and third owner details. I just copied the first and added numbers. 
    }

}
    



    

