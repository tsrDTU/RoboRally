//import RoboData;

public class Functionality implements IUserInterface
{
   private RoboData RData;
    public Functionality(int nrOfPlayers)
    {
        RData=new RoboData(nrOfPlayers);
    }


    public void movePlayer(int plNr, int posX, int posY)
    {
        RData.movePlayer(plNr,posX,posY);
    }

}
