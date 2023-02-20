/*
* File: MainConsole.java
* Author: Berkovics Gellért
* Copyright: 2023, Berkovics Gellért
* Group: Szoft I-1 N
* Date: 2023-02-20
* Github: https://github.com/berkovics/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole {

    public MainConsole() {
        this.about();
        System.out.println("Feladat 0354");
        String aSide = input("a szakasz hossza: ");
        String bSide = input("b szakasz hossza: ");
        double a = Double.parseDouble(aSide);
        double b = Double.parseDouble(bSide);
        Cone cone = new Cone();
        System.out.println(cone.calcTerulet(a, b));
    }

    public String input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + " ");
        String text = scanner.nextLine();
        return text;
    }
    
    public void about() {
        System.out.println("---------------------------");
        System.out.println(" Berkovics Gellért");
        System.out.println(" Szoft I-1 N");
        System.out.println(" 2023-02-20");
        System.out.println("---------------------------");
    }
}
