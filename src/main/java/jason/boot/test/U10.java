package jason.boot.test;

public class U10 {
    public static int  one(int []  obj){
        int[]  a={255,254,238};
        int[]  b={220,213,203};
        int[]  c={219,206,203};
        int[]  d={211,155,169};
        int[]  e={211,151,181};
        double []  values=new double[5];
         values[0] = rgbSimilarity(a, obj);
         values[1] = rgbSimilarity(b, obj);
         values[2] = rgbSimilarity(c, obj);
         values[3] = rgbSimilarity(d, obj);
         values[4] = rgbSimilarity(e, obj);
         double   temp=Double.MAX_VALUE;
         int   po=-1;
         StringBuffer  stringBuffer =new StringBuffer();
        for (int i = 0; i <values.length ; i++) {
            stringBuffer.append(i+"---结果"+":"+values[i]);
            if (values[i]<temp){
                temp=values[i];
                po=i;
            }
        }
        System.out.println(stringBuffer.toString());

        return po;

    }
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


    public static int  five(int []  obj){
        int[]  a={203,72,0};
        int[]  b={222,102,28};
        int[]  c={219,180,0};
        int[]  d={95,162,36};
        int[]  e={0,130,186};
        double []  values=new double[5];
        values[0] = rgbSimilarity(a, obj);
        values[1] = rgbSimilarity(b, obj);
        values[2] = rgbSimilarity(c, obj);
        values[3] = rgbSimilarity(d, obj);
        values[4] = rgbSimilarity(e, obj);
        double   temp=Double.MAX_VALUE;
        int   po=-1;
        StringBuffer  stringBuffer =new StringBuffer();
        for (int i = 0; i <values.length ; i++) {
            stringBuffer.append(i+"---结果"+":"+values[i]);
            if (values[i]<temp){
                temp=values[i];
                po=i;
            }
        }
        System.out.println(stringBuffer.toString());

        return po+1;

    }
    public static double rgbO(int [] bg,int [] obj){
        int  r = bg[0] - obj[0];
        int  g = bg[1] - obj[1];
        int  b = bg[2] - obj[2];
        double  sum = Math.pow(r, 2) + Math. pow(g, 2) + Math.pow(b, 2);
        return Math.sqrt(sum);
    }
    public static int  fiveO(int []  obj){
        int[]  a={203,72,0};
        int[]  b={222,102,28};
        int[]  c={219,180,0};
        int[]  d={95,162,36};
        int[]  e={0,130,186};
        double []  values=new double[5];
        values[0] = rgbO(a, obj);
        values[1] = rgbO(b, obj);
        values[2] = rgbO(c, obj);
        values[3] = rgbO(d, obj);
        values[4] = rgbO(e, obj);
        double   temp=Double.MAX_VALUE;
        int   po=-1;
        StringBuffer  stringBuffer =new StringBuffer();
        for (int i = 0; i <values.length ; i++) {
            stringBuffer.append(i+"---结果"+":"+values[i]);
            if (values[i]<temp){
                temp=values[i];
                po=i;
            }
        }
        System.out.println(stringBuffer.toString());

        return po+1;

    }
}
