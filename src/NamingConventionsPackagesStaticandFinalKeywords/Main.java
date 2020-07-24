package NamingConventionsPackagesStaticandFinalKeywords;


import PackageChallenge.Series;
import org.w3c.dom.Node;

//import org.w3c.dom.Node;
public class Main {

    public static void main(String[] args){
        /**/
        Node node =null;

        MyWindow mywindow =new MyWindow("New Window");
        mywindow.setVisible(true);

        for (int i =0 ; i<=10 ; i++){
            System.out.println(Series.nSum(i));
        }

        for (int i =0 ; i<=10 ; i++){
            System.out.println("*******************************");
            System.out.println(Series.factorial(i));
        }

        for (int i =0 ; i<=10 ; i++){
            System.out.println("////////////////////////////////");
            System.out.println(Series.fibonacci(i));

        }

        //Scope
        Account account = new Account("David");
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(-20);
        account.withdraw(-300);
        account.calculateBalance();
        System.out.println("David balance is: "+account.getBalance());
        // Static


    }
}
