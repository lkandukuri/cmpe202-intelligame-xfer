import greenfoot.Greenfoot;

public class GameLevelCompletedState extends GameState {

    public GameLevelCompletedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new MyWorld());
    }
}