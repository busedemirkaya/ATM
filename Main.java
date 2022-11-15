import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        //kullanıcıya 3 kez şifre girme hakkı tanımlıyoruz
        int right = 3, balance =1500, select;


        while(right > 0){
            System.out.print("User Name: ");
            userName = inp.nextLine();
            System.out.print("Password: ");
            password = inp.nextLine();
            //.euqals string sınıfında eşitlik sorgusu için kullanılır
            if (userName.equals("buse") && (password.equals("1234"))) {
                System.out.print("Welcome!");
                do {
                    System.out.print("Please, select the process.");
                    System.out.print("1-Deposit money\n" + "2-Withdraw money\n" + "3-balance inquiry\n" + "4-Log out.\n");
                    select = inp.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Amount of money: ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println(price+ "TL has been deposited into your account. Your balance: "+balance);
                            break;

                        case 2:
                            System.out.print("Amount of money: ");
                            int price2 = inp.nextInt();
                            if (price2 > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price2;
                                System.out.println("Your remaining balance: "+balance);
                            }
                            break;

                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;

                    }
                }while (select != 4);
                System.out.println("See you again.");
                break;

            } else{
                 right --;
                 System.out.print("Wrong username or password. Log in again.");
                 if (right == 0) {
                    System.out.print("Your account is blocked. Please, contact the bank.");
                } else {
                    System.out.print("Residual right: "+right);
                }

            }

        }
    }
}