import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StudentDesk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentDesk extends Actor
{
    /**
     * Act - do whatever the StudentDesk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deskGroup;
    public void act() 
    {
        // desks should not act.
    } 
    public void setDeskGroup(int i){
        if (i>0 && i<9)
           deskGroup=i;
        }
     public int getDeskGroup(){
           return deskGroup;
        }
    /* The seatingReqs method can be used to collect user input for seating requirements.
     * It can be called in the Classroom world when necessary.
     */
    public String seatingReqs(){
        String reqs = Greenfoot.ask("Do you have any seating requirements?");
        return reqs;
    }
}
