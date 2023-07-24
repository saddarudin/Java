package com.java;
import java.io.*;

class EraserThread implements Runnable {
    private boolean stop;
    public EraserThread(String prompt) {
        System.out.print(prompt);
    }
    public void run () {
        stop = true;
        while (stop) {
            System.out.print("\010*");
            try {
                Thread.sleep(1);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void stopMasking() {
        this.stop = false;
    }
}

class PasswordField {
    static String password;
    public static String readPassword (String prompt) {
        EraserThread et = new EraserThread(prompt);
        Thread mask = new Thread(et);
        mask.start();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         password = "";

        try {
            password = in.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        et.stopMasking();
        return password;
    }
}

class TestApp {
    public static void main(String[] args) {
        String password1=PasswordField.readPassword("Enter password: ");
        System.out.println("The password entered is: "+password1);
        if(password1.equals(new String("saddar"))) System.out.println("Hello");
    }
}