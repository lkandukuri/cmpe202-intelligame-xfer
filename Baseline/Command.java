import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Command 
{
    public void execute();
    public void setReceiver(Receiver r);
}
