import RoboComponents.*;

public class RoboData
{
    private RoboPlayer[] RPlayers=new RoboPlayer[11];
    private GameBoard GBoard;
    private StartBoard stBoard;
    private CheckPoints checkP;
    private DamageCards dmCard;
    public RoboData(int nrOfPlayers)
    {
        GBoard=new GameBoard();

        stBoard=new StartBoard();

        for (int i = 0; i < nrOfPlayers; i++)
        {
            RPlayers[i]=new RoboPlayer();

        }

        checkP=new CheckPoints();

        dmCard=new DamageCards();


    }

    public void movePlayer(int plNr,int posX,int posY)
    {
        RPlayers[plNr].movePlyer(posX,posY);
    }
}
