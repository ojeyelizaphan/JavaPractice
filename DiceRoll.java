
public class DiceRoll{
   public static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

    public static void main(String[] args){

        for (int roll = 0; roll< 1000; roll++){

            double face  = Math.random();

            if (face>= 0.0 && face<1.0/6 )
                count1++;
            else if(face>=1.0/6 && face<2.0/6)
                count2++;
            else if (face>=2.0/6 && face<3.0/6)
                count3++;
            else if (face>=3.0/6 && face<4.0/6)
                count4++;
            else if (face>= 4.0/6 && face<5.0/6)
                count5++;
            else if (face>=5.0/6 && face<1.0)
                count6++;
        }

        //calculating percentage frequency
        double p1 = (double)count1/1000 * 100;
        double p2 = (double)count2/1000 * 100;
        double p3 = (double)count3/1000 * 100;
        double p4 = (double)count4/1000 * 100;
        double p5 = (double)count5/1000 * 100;
        double p6 = (double)count6/1000 * 100;

        System.out.println("Face\tFrequency\tPercentage");
        System.out.printf("1\t%8d\t%10.2f\n2\t%8d\t%10.2f\n3\t%8d\t%10.2f\n4\t%8d\t%10.2f\n5\t%8d\t%10.2f\n6\t%8d\t%10.2f",count1,p1,count2,p2,count3,p3,count4,p4,count5,p5,count6,p6);
    }
}