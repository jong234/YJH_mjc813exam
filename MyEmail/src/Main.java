
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Main {

    static Properties prop;
    static Session session;
    static MimeMessage message;

    public static void main(String[] args) throws Exception {
        generateAndSendEmail();
        System.out.println("\n\n ===> your java program will now exit ");
    }

    private static void generateAndSendEmail() throws Exception {
        final String user = "@naver.com";
        final String password = "";

        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.naver.com");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.naver.com");

        Session session1 = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        try{
            MimeMessage message = new MimeMessage(session1);
            message.setFrom(new InternetAddress(user));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress("@naver.com"));
            message.setSubject("Hello World");
            message.setText("정상적으로 메일이 전송 되었어요.");

            Transport.send(message);
            System.out.println("Sent message successfully....");
        }catch(AddressException e){
            e.printStackTrace();
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}