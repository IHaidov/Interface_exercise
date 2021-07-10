package com.company;

import java.util.Random;
import java.util.logging.Logger;
 interface Ishootable
{
    public void weapon(int guns);
    public boolean fire(double x, double y);
}

 interface  IEngine
{
    public void engine(boolean pos, String type);

}
  interface IDiscovery
{
    public void walk();
}
class Engine implements IEngine
{
int cores;
    @Override
    public void engine(boolean pos, String type) {
        cores++;
        System.out.println(cores);
    }
}
abstract class Shuttle
{
    IEngine eng;
    abstract public void Fly(int f);
    public void setengine(IEngine engine){
        this.eng=engine;
    };

}
 class SpaceShip extends Shuttle {
    public int fuel;


     @Override
     public void Fly(int f) {

     }
 }

 class SpaceGround extends SpaceShip implements IDiscovery
{
    @Override
    public void walk() {
        Random rand=new Random();

        System.out.println("I can walk "+rand.nextInt(50)+" km");
    }

    public void ParentShip()
    {
        System.out.println("My parent is SpaceShip");
    }
    public void Go_On_Legs()
    {
        System.out.println("I can walk on 4 legs");
    }

}

  class  SpaceShooter extends  SpaceGround implements Ishootable
{


    @Override
    public boolean fire(double x, double y) {
        Random r= new Random();
        double x1=r.nextDouble()*(x+1 - (x-1))+(x-1);
        double y1=r.nextDouble()*(y+1 - (y-1))+(y-1);
        System.out.println(x1+" "+y1);
        if((Math.round(x1)==x)&&(Math.round(y1)==y))return true;
        else return false;
    }


    private int guns;
    private void setGuns(int guns) {
        this.guns = guns;
    }
    @Override
    public void weapon(int guns) {
        setGuns(guns);
        System.out.println(this.guns);
    }


}
