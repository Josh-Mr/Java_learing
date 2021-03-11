package com.file;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName FileTest.java
 * @Description TODO
 * @createTime 2021-02-24 09:14:00
 */
public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("d:/abc/1/s", "1.txt");
        if (!file.exists()){//是否存在文件
            File parentFile = file.getParentFile();//获取父级目录
            if (!parentFile.exists()){
                parentFile.mkdirs();// 创建文件夹（多个一并创建）
            }
            file.createNewFile();//创建文件
        }
        file.getAbsolutePath();//获取绝对路径d:\abc\1\s\1.txt
        file.getName();//文件名字1.txt
        file.getPath();//获取路径d:\abc\1\s\1.txt
        file.getCanonicalPath();//获取标准的路径D:\abc\1\s\1.txt
        file.length();//文件大小
        file.renameTo(new File(file.getParentFile(),"abc.txt"));//修改文件名称
        file.list();//当前目录下的所有文件，如果是文件显示null
        file.isDirectory();//是否是目录
        file.isFile();//是否是文件
        file.canExecute();//文件是否具有执行操作
        file.canRead();//文件是否具有可读操作
        file.canWrite();//文件是否具体写入操作
        file.delete();//删除文件

    }
}
