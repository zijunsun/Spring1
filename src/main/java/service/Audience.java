package service;

/**
 * Created by SUN on 2016/11/23.
 */
public class Audience {
    public void takeSeats(){
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhone(){
        System.out.println("The audience is turning off their cellphone.");
    }

    private void applaud(){
        System.out.println("TCLAP CLAP CLAP CLAP");
    }
    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }
}
