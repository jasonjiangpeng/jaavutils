package tool.utils;

import org.apache.log4j.Logger;
import tool.utils.manager.FileImp;

public class Test {
    public static void main(String[] args) {
        String v="aad29aab8e06931e015546ca20b50e63";
 String  path="E:\\axure\\pro1\\test1\\page_1.html";
 long  startTime=System.currentTimeMillis();
          //aad29aab8e06931e015546ca20b50e63
        //page 2:557216df23e43c2d3c1cb36bc47cb52d
 String result=new FileImp().getFileHash(path);
        Logger.getLogger(Test.class).debug(result);
 long end=System.currentTimeMillis()-startTime;
 Logger.getLogger(Test.class).debug(end);
    }
}
