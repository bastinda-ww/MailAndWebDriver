package ru.sbt.lesson5.steps;

import net.thucydides.core.annotations.Step;
import ru.sbt.lesson5.pages.Mail;

/**
 * Created by НОЦ Робототехники on 17.07.2017.
 */
public class MailStep {
    public Mail mailPage;

    @Step("open Mail.ru")
    public void openMailPage ()
    {
        mailPage.open();
    }
    @Step("Seach and authorization")
    public void authorization (String login, String password){
        mailPage.inputLogin.type(login);
        mailPage.inputPassword.type(password);
        mailPage.btnToComeIn.click();
    }
    @Step("create new letter")
    public void createNewLatter() {
        mailPage.newLetter.click();
    }
    @Step("edit new letter")
    public void editLetter(String whom, String subject, String message) {
        mailPage.whom.type(whom);
        mailPage.subject.type(subject);
        mailPage.message.type(message);
        mailPage.send.click();
    }
    @Step("letter send")
    public void letterHasCome(){
        mailPage.input.click();
        mailPage.firstMessage.click();
    }

}
