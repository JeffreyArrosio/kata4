package View;
import Model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    
    public static List <Mail> read(String file){
        List <Mail> mailList = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(file)));
            while(true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                if (Mail.isMail(line)){
                    mailList.add(new Mail(line));
                }
            }
            
        } catch (FileNotFoundException ex){
            System.err.println("ERROR MailListReader::read (FIle Not Found)" + ex.getMessage());
        } catch (IOException ex){
            System.err.println("ERROR MailListReader::read (FIle Not Found)" + ex.getMessage());
        }
        return mailList;
    }
}
