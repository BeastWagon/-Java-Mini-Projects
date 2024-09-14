import java.util.Scanner;
class Bank{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int balance=0;
    char choice;
    System.out.println("Please enter a choice:w,d,c");
    choice=scanner.next().charAt(0);
    switch (choice) {
        case 'w':
            withdraw(balance,scanner);
            
            break;
        case 'd':
            deposit(balance,scanner);
            break;
        case 'c':
            checkBalance(balance);
            break;        
        default:
           System.out.println("Enter a valid choice");
    }

}
public static int deposit(int balance,Scanner scanner){
    System.out.println("Enter the amount to be deposited");
    int amount=scanner.nextInt();
    balance+=amount;
    checkBalance(balance);
    return 0;
}
public static double withdraw(int balance,Scanner scanner){
    System.out.println("Enter the amount to be withdrawed");
    int amount=scanner.nextInt();
    if(amount>balance){
        System.out.println("Insufficient balance..."+balance+"please enter a valid amount");
        return withdraw(balance,scanner);
    }

    else{
        balance-=amount;
        checkBalance(balance);
    }
    return 0;
}
public static double checkBalance(int balance){
    System.out.println("Your balance is"+balance);
    return 0;

}
}