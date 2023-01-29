import java.util.*;  
  
//create ATMExample class to implement the ATM functionality  
public class atm
{  
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit, amt;
        long acc; 
        int k=0;
        String[] history= new String[15];       
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
          //  System.out.println("Automated Teller Machine");  
            System.out.println("Enter 1 for Withdraw");  
            System.out.println("Enter 2 for Deposit");  
            System.out.println("Enter 3 for Check Balance");  
            System.out.println("Enter 4 for Transfer");  
            System.out.println("Enter 5 for Transcation history");
            System.out.println("Enter 6 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                	System.out.print("Enter money to be withdrawn:");  
                      
                	//get the withdrawal money from user  
                	withdraw = sc.nextInt();  
                      
                	//check whether the balance is greater than or equal to the withdrawal amount  
                	if(balance >= withdraw)  
                	{  
                		//remove the withdrawal amount from the total balance  
                		balance = balance - withdraw;  
                		System.out.println("Amount has been withdrawn");
                		System.out.println("Please collect your money"); 
                		
                		history[k]= withdraw+" has been withdrawn from your account.";
                		k++;
                	}  
                	else  
                	{  
                		//show custom error message   
                		System.out.println("Insufficient Balance");  
                	}  
                	System.out.println("");  
                	break;  
   
                case 2:  
                      
                	System.out.print("Enter money to be deposited:");  
                      
                	//get deposit amount from the user  
                	deposit = sc.nextInt();  
                      
                	//add the deposit amount to the total balance  
                	balance = balance + deposit;  
                	System.out.println("Your money has been successfully deposited");  
                	System.out.println("");  
                	history[k]= deposit+" has been deposited into your account.";
                	k++;
                	break;  
   
                case 3:  
                	//displaying the total balance of the user  
                	System.out.println("Balance : "+balance);  
                	System.out.println("");  
                	break;  
                	
                case 4:
                	//get the account details and transfer the amount
                	System.out.println("Enter the account number of the receiver");
                	acc=sc.nextLong();
                	System.out.println("Enter the amount to be transfered:");
                	amt=sc.nextInt();
                	System.out.println("Money has been successfuly transfered");
                	break;
                	
                case 5:
                	System.out.println("Transcation history is: ");
                	for(int i=0;i<k;i++)
                	{
                		System.out.println(history[i]);
                		
                	}
                	break;
                	
                case 6:  
                	//exit from the menu  
                	System.exit(0);  
        
        		default:
        			System.out.println("Invaild input");
            }  
        }  
    }  
}  