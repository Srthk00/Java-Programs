
import java.io.FileInputStream;

class practise{
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("Sample.txt");
        int x=0;
        while((x=fis.read())!=-1){ 
            System.out.print((char)x);
        }
        fis.close();
    }
}