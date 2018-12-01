using System;

namespace HSim
{
    public class GameLogic
    {
        public int CalcScore(int[,] userData)
        {
            int score;
            double sum = 0;
            double average;
            double variance;
            double stdDeviation;

            for (int i = 0; i < 95; i++)
            {
                sum += userData[1, i];
            }

            score = (int)sum;
            average = (double)sum / 95;

            for (int i = 0; i < 95; i++)
            {
                sum += Math.Pow(average - userData[1, i], 2);
            }

            variance = (double)sum / 95;

            stdDeviation = Math.Sqrt(variance);

            return (int)Math.Round((1000 * score) / stdDeviation);
        }

        public void RandomEvent(Event[] setList, int a, int b, Player player)
        {
            Random rnd = new Random();
            int eventNum = rnd.Next(a, b);

            setList[eventNum].Draw();
            player.score += setList[eventNum].ScoreBonus(Console.ReadLine());

        }
    }
}
