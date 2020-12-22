
package diceroll;

/**
 *
 * @author Kahalf
 */
    public class DiceRoll{
   public static int face_1 = 0, face_2 = 0, face_3 = 0, face_4 = 0, face_5 = 0, face_6 = 0;
   
// rolling the dice to obtain random faces each time the dice is rolled until the dice is rolleed 1000 times.
    public static void main(String[] args){

        for (int dice_roll = 0; dice_roll< 1000; dice_roll++){

            double FaceObtained  = Math.random();

            if (FaceObtained>= 0.0 && FaceObtained<1.0/6 )
                face_1++;
            else if(FaceObtained>=1.0/6 && FaceObtained<2.0/6)
                face_2++;
            else if (FaceObtained>=2.0/6 && FaceObtained<3.0/6)
                face_3++;
            else if (FaceObtained>=3.0/6 && FaceObtained<4.0/6)
                face_4++;
            else if (FaceObtained>= 4.0/6 && FaceObtained<5.0/6)
                face_5++;
            else if (FaceObtained>=5.0/6 && FaceObtained<1.0)
                face_6++;
        }

        //calculating percentage frequency
        double p1 = (double)face_1/1000 * 100;
        double p2 = (double)face_2/1000 * 100;
        double p3 = (double)face_3/1000 * 100;
        double p4 = (double)face_4/1000 * 100;
        double p5 = (double)face_5/1000 * 100;
        double p6 = (double)face_6/1000 * 100;

        System.out.println("Face\tFrequency\tPercentage");
        System.out.printf("1\t%8d\t%10.2f\n2\t%8d\t%10.2f\n3\t%8d\t%10.2f\n4\t%8d\t%10.2f\n5\t%8d\t%10.2f\n6\t%8d\t%10.2f",face_1,p1,face_2,p2,face_3,p3,face_4,p4,face_5,p5,face_6,p6);
    }
}

   
    
    

