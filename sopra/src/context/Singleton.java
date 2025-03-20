package context;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Singleton {

    private static Singleton instance = null;


    private Singleton() {
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String inputString(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }

    /**
     * @param msg message to print to the console
     * @return String typed in the console
     */
    public int inputInt(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }





}

