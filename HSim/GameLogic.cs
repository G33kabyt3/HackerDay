using System;

namespace HSim
{
    public class GameLogic
    {
        public GameLogic()
        {
        }
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
    }
}
