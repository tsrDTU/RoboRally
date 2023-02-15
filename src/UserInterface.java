public class UserInterface
{
    Functionality func;

    public UserInterface()
    {
        func=new Functionality(3);
    }
    public void movePlayer(int plNr,int posX,int posY)
    {
        func.movePlayer(plNr,posX,posY);
    }

}
