package jason.boot.test;

import sun.misc.Unsafe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
   static   double   rgbSimilarity(int[] bg, int[] obj) {


       if (bg==null||obj==null){
           return -2;
       }
     if (bg.length!=3||obj.length!=3){
         return -1;
     }
        double  meanr = (bg[0] + obj[0]) / 2;
        int  r = bg[0] - obj[0];
        int  g = bg[1] - obj[1];
        int  b = bg[2] - obj[2];
        double  sum = (2 + meanr / 255)*Math.pow(r, 2) + 4 *Math. pow(g, 2) + (2 + (255 - meanr) / 256)*Math.pow(b, 2);
        return Math.sqrt(sum);


    }
    //1,1   3,3    1,2,
    public static void main(String[] args) {
        float   testvalue1=3.4f;
        float  btest=testvalue1%2;
        System.out.println(btest);
   int[]  bg1={35,150,105};//浅红
           System.out.println(U10.five(bg1));
        System.out.println("-------------");
        System.out.println(U10.fiveO(bg1));
    }
    // and everything`s all by the way,when I grow older ,I will be there at your side to remind you .How I still love you I still love you ,Hurry back.Sometimes it feels good to love you.
    public static String[]  getNextData(long  nowtime){
        long  time=86400000L;
String   value[]=new String[7];
        for (int i = 0; i <7 ; i++) {
            Date yesterday = new Date(nowtime - time*i);
          value[i] = new SimpleDateFormat(" MM-dd").format(yesterday);


        }

        return value;
    }
    //
    public static byte[] intToBytes2(int n){
        byte[] b = new byte[4];

        for(int i = 0;i < 4;i++)
        {
            b[i]=(byte)(n>>(24-i*8));

        }
        return b;
    }
    public static int[]  intTobyte(int  vluae){
        int[]  ints=new int[4];
        ints[0]=vluae|0xff000000;
        ints[1]=vluae&0x00ff0000;
        ints[2]=vluae&0x0000ff00;
        ints[3]=vluae&0x000000ff;
   return ints;

    }

}
