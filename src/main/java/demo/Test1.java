package demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer>  integers=new ArrayList<>();
        integers.add(5);
        integers.add(15);
        integers.add(25);
        integers.add(35);
        Collections.reverse(integers);

        for (int i = 0; i <integers.size() ; i++) {
            System.out.println(integers.get(i));
        }
    }
    public static String calcos(int[] src,int [] dst){
        long   rgb1=  src[1]*src[1]+src[2]*src[2]+src[0]*src[0];
        long   rgb2=  dst[1]*dst[1]+dst[2]*dst[2]+dst[0]*dst[0];
  float x=1.0f*(src[1]*dst[1]+src[2]*dst[2]+src[0]*dst[0])/(rgb1*rgb2);
        DecimalFormat decimalFormat=new DecimalFormat(".00000000");//构造方法的字符格式这里如果小数不足2位,会以0补足.
        String p=decimalFormat.format(x);//format 返回的是字符串
       return  p;

    }
}
