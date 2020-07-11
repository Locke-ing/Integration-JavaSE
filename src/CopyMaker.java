import java.io.*;

public class CopyMaker{
    //F:\\Hello.txt","D:\\copyHello.txt
    String sourceName,destName;
    BufferedReader source;//字符输入流带缓冲
    BufferedWriter dest;//字符输出流带缓冲
    String line;

    //打开文件
    private boolean openFiles(){
        try {           //F:\\Hello.txt
            source = new BufferedReader(new FileReader(sourceName));
        }catch (IOException iox){
            System.out.println("Problem opening "+sourceName);
            return false;
        }
        try {
            //字符输出流 输出到D:\\copyHello.txt
            dest = new BufferedWriter(new FileWriter(destName));
        }catch (IOException iox){
            System.out.println("Problem opening"+destName);
            return false;
        }
        return true;
    }

    //复制文件
    private boolean copyFiles(){
        try {
            //从输入流读取
            line = source.readLine();
            while (line != null){
                dest.write(line);
                dest.newLine();
                //刷新
                dest.flush();
                line = source.readLine();
            }
        }catch (IOException iox){
            System.out.println("Problem reading or writing");
            return false;
        }catch (ArithmeticException e){
            //TODO
        }catch (NullPointerException e){
            //TODO
        }
        return true;
    }

    //关闭文件
    private boolean closeFiles(){
        boolean retVal = true;
        try{
            source.close();
        }catch (IOException iox){
            System.out.println("Problem closing"+sourceName);
            retVal = false;
        }
        try{
            dest.close();
        }catch (IOException iox){
            System.out.println("Problem closing"+destName);
            retVal = false;
        }
        return retVal;
    }

    //自定义路径复制
    // 成功返回true，失败返回false
    public boolean copy(String src,String dst){
        sourceName = src;
        destName = dst;
        return openFiles()&&copyFiles()&&closeFiles();
    }
}
