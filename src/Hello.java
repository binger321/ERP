import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/12/11 0011
 * Time: 19:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Administrator\\Desktop\\1.txt")));
        BufferedReader br2=new BufferedReader(new FileReader(new File("C:\\Users\\Administrator\\Desktop\\2.txt")));
        BufferedWriter br3=new BufferedWriter(new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\3.txt")));
        List<String> line1=new ArrayList<String>();
        List<String> line2=new ArrayList<String>();
        String line=null;
        while((line=br.readLine())!=null){
            line1.add(line);
        }
        System.out.println("line1:"+line1.size());
        while((line=br2.readLine())!=null){
            line2.add(line);
        }
        System.out.println("line2:"+line2.size());
        for(int i=0;i<line1.size();i++){
            br3.write(line1.get(i)+" where id= "+line2.get(i)+";");
            br3.newLine();
        }
        br.close();
        br2.close();
        br3.close();


    }
}