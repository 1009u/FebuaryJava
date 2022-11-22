package exceptionHandling;

public class BalanceException extends Exception{
    BalanceException(String balance){
        super(balance);
    }

}

