package ru.sbt.lesson5.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by НОЦ Робототехники on 17.07.2017.
 */
@DefaultUrl("http://mail.ru/")
public class Mail extends PageObject{

    @FindBy (name = "Login")
    public  WebElementFacade inputLogin;

    @FindBy (name = "Password")
    public  WebElementFacade inputPassword;

    @FindBy(id = "mailbox__auth__button")
    public WebElementFacade btnToComeIn;

    @FindBy(className = "b-toolbar__btn__text b-toolbar__btn__text_pad")
    public WebElementFacade newLetter;

    @FindBy(className = "b-input b-input_textarea js-compose-labels js-input compose__labels compose__labels_placehold-on-suggest b-contact-container")
    public WebElementFacade whom;

    @FindBy(className = "compose-head__field")
    public WebElementFacade subject;

    @FindBy(className = "mceContentBody increase-font compose2")
    public WebElementFacade message;

    @FindBy(className = "b-toolbar__btn b-toolbar__btn_ b-toolbar__btn_false js-shortcut")
    public WebElementFacade send;

    @FindBy(className = "b-nav__item__text b-nav__item__text_unread")
    public WebElementFacade input;

    @FindBy(id = "15003587940000000243")
    public  WebElementFacade firstMessage;
}
