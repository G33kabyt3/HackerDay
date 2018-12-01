package GameLogic;

import java.util.LinkedList;

public class GameLogic {
	LinkedList<Event> setList;
	LinkedList<String> msgList;
	public GameLogic()
	{
      setList = new EventData().setList;
      msgList = new MsgData().msgList;
	}
	
	public void RandomMessage()
	{
		int msgNum = (int)(Math.floor(Math.random() * msgList.size()));
		System.out.println(msgList.get(msgNum));
	}
	
	public void CalcScore(Player player)
    {
		int[][] userData = player.userData;
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

        player.score += (int)Math.round((1000 * score) / stdDeviation);
    }

    public void RandomEvent(Player player)
    {
        int eventNum = (int)(Math.floor(Math.random() * setList.size()));

        setList.get(eventNum).Draw();
        
        player.score += setList.get(eventNum).ScoreBonus("");
        //TODO

    }
    
}
