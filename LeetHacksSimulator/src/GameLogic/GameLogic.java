package GameLogic;

import java.util.LinkedList;

public class GameLogic {
	
	public LinkedList<Event> setList;
	public GameLogic()
	{
		setList = new LinkedList<Event>(); 
		setList.add(0, new Event("Laser Sharks"));
		setList.get(0).rule = "Pew Pew";
		setList.get(0).graphic.add(0, "/*******************************************************************/");
		setList.get(0).graphic.add(0, "/      ,|                                                           /");
		setList.get(0).graphic.add(1, "/     / ;                                                           /");
		setList.get(0).graphic.add(2, "/    /  \\                                                          /");
		setList.get(0).graphic.add(3, "/   : ,'(                                                           /");
		setList.get(0).graphic.add(4, "/   |( `.\\                                                         /");
		setList.get(0).graphic.add(5, "/   : \\  `\\       \\.                                             /");
		setList.get(0).graphic.add(6, "/    \\ `.         | `.                                             /");
		setList.get(0).graphic.add(7, "/     \\  `-._     ;   \\                                           /");
		setList.get(0).graphic.add(8, "/      \\     ``-.'.. _ `._                                         /");
		setList.get(0).graphic.add(9, "/       `. `-.            ```-...__                                 /");
		setList.get(0).graphic.add(10, "/        .'`.        --..          ``-..____                        /");
		setList.get(0).graphic.add(11, "/      ,'.-'`,_-._            ((((   <o. </,'/\\/\\/\\/\\/\\/       /");
		setList.get(0).graphic.add(12, "/           `' `-.)``-._-...__````  ____.-'                         /");
		setList.get(0).graphic.add(13, "/               ,'    _,'.--,---------'                             /");
		setList.get(0).graphic.add(14, "/           _.-' _..-'   ),'                                        /");
		setList.get(0).graphic.add(15, "/          ``--''        `                                          /");
		setList.get(0).graphic.add(15, "/*******************************************************************/");
		
	}
	
	public void RandomMessage(String[] message, int bound)
	{
		int eventNum = (int)(Math.round(Math.random() * bound));
		System.out.println(message[eventNum]);
	}
	
	public int CalcScore(int[][] userData)
    {
        int score;
        double sum = 0;
        double average;
        double variance;
        double stdDeviation;

        for (int i = 0; i < 95; i++)
        {
            sum += userData[1][i];
        }

        score = (int)sum;
        average = (double)sum / 95;

        for (int i = 0; i < 95; i++)
        {
            sum += Math.pow(average - userData[1][i], 2);
        }

        variance = (double)sum / 95;

        stdDeviation = Math.sqrt(variance);

        return (int)Math.round((1000 * score) / stdDeviation);
    }

    public void RandomEvent(Player player)
    {
        int eventNum = (int)(Math.floor(Math.random() * setList.size()));

        setList.get(eventNum).Draw();
        
        player.score += setList.get(eventNum).ScoreBonus("");
        //TODO

    }
    
}
