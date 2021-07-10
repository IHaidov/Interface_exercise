package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
SpaceShip sp=new SpaceShip();
IEngine eng=new Engine();
eng.engine(true,"Mark5");
sp.setengine(eng);
sp.eng.engine(true,"Mark1");
sp.Fly(500);
//sp.engine(true,"Mark_500_xp");
SpaceShooter ss=new SpaceShooter();
if(ss.fire(23,45))System.out.println("Fire was successful");
else System.out.println("Fire was awful");
//ss.engine(false,"John_250_JK");
ss.weapon(4);
ss.weapon(10);
    }
}
