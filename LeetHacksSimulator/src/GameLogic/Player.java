package GameLogic;

public class Player {
	String name;
    public int[][] userData = new int[2][95];
    public int score;

    public Player(String name)
    {
        this.name = name;
        for (int i = 0; i < 95; i++)
        {
            this.userData[0][i] = 32 + i;
            this.userData[1][i] = 0;
        }
    }
    
    public void insert(String userData)
    {
    	for(int i = 0; i < userData.length(); i++) 
    	{
    		if (userData.charAt(i) == this.userData[0][i])
    		{
    			++this.userData[1][i];
    		}
    	}
    }
}
