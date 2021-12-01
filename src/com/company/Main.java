package com.company;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Komedia av= new Komedia("Bisness po kazakski","Komedia","J.Momyshev","2016");
        System.out.println(av.name);
        av.hashCode();
        av.switchMove();
        av.pause();
        av.stop();
        av.play();
    }
}
