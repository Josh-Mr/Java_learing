package com.arithmetic;

import java.io.File;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName DiGuiTest.java
 * @Description TODO
 * @createTime 2021-02-24 11:06:00
 */
public class DiGuiTest {


    /**
     * 用递归但是累乘数列n! = n * (n-1) * (n-2) ... *1
     * @return
     */
    private static int diGuiNumber(int n){

        int count = 1;
        if(n == 1 ){
           return  count ;
        }
        count = n * diGuiNumber(n-1);
        return count;
    }


    /**
     * 删除路径下的全部文件和目录
     * @param file
     */
    private static void deleteAllFileAndDirectory(File file){

        if (file.isFile()){
            file.delete();
        }else{
            if (file.isDirectory()){
                for (File f :file.listFiles()){
                    deleteAllFileAndDirectory(f);
                    if(f.isDirectory()){//删除目录
                        f.delete();
                    }
                }
            }
        }
    }

    /**
     * 显示路径下的全部文件和目录
     * @param file
     */
    private static void queryAllFileAndDirectory(File file){
        if(file.isFile()){
            System.out.println(file.getAbsolutePath());
        }else{
            File[] files = file.listFiles();
            for(File f :files){
                queryAllFileAndDirectory(f);
                if (f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }




    public static void main(String[] args) {

//        System.out.println(DiGuiTest.diGuiNumber(4));

//        DiGuiTest.deleteAllFileAndDirectory(new File("D:/abc"));

//        System.out.println(new File("D:/abc").delete());

        DiGuiTest.queryAllFileAndDirectory(new File("D:/NCHOME"));
    }

}
