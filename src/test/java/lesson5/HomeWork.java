package lesson5;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ru.sbt.lesson5.steps.MailStep;

import java.util.Scanner;


/**
 * Created by dmitriy on 24.06.17.
 */

@RunWith(SerenityRunner.class)
public class HomeWork {
    public String login = "";
    public String password = "";
    public String message = "Какое то сообщение, которое мне же потом и отправится";
    public String whom = "andrei_denisov96@mail.ru";
    public String subject = "Web driver test";

    /*@Before
    public void temp() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the following data with a space.");
        System.out.println("Enter login,\t password,\t message,\t to whom to send a letter,\t and subject.\n");
        login = in.next();
        password = in.next();
        message = in.next();
        whom = in.next();
        subject = in.next();
    }
*/
    @Managed
    WebDriver driver;

    @Steps
    MailStep mailStep;

    @Test
    public void homeWork1(){
        mailStep.openMailPage();
        mailStep.authorization(login,password);
        Assert.assertEquals("(99) Входящие - Почта Mail.Ru", driver.getTitle());
    }
    @Test
    public void writeLetterPage (){
        mailStep.createNewLatter();
        Assert.assertEquals("Новое письмо - Почта Mail.Ru",driver.getTitle());
    }
    @Test
    public void editLetter (){
        mailStep.editLetter(whom, subject,message);
    }
    @Test
    public void mailIsSend (){
        Assert.assertEquals("Письмо отправлено - Почта Mail.Ru",driver.getTitle());
   }
   @Test
    public void inputLetter(){
        mailStep.letterHasCome();
        Assert.assertTrue(driver.getPageSource().contains(subject));
   }
}
