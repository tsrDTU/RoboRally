import RoboComponents.*;

public class RoboData
{
    RoboPlayer[] RPlayers=new RoboPlayer[11];
    public RoboData(int nrOfPlayers)
    {
        GameBoard GBoard=new GameBoard();

        StartBoard stBoard=new StartBoard();

        for (int i = 0; i < nrOfPlayers; i++)
        {
            RPlayers[i]=new RoboPlayer();

        }

        CheckPoints checkP=new CheckPoints();

        DamageCards dmCard=new DamageCards();

    }

    public void movePlayer(int plNr,int posX,int posY)
    {
        RPlayers[plNr].movePlyer(posX,posY);
    }
}
