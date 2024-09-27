package lippia.web.constants;

public class Log_In_Constants {

    // BOTONES OPCIONES DE LOGUEO MANUAL Y GOOGLE
    public static final String OPTION_LOGIN_GOOGLE_BUTTON = "xpath://span[@class='cl-mx-3 cl-flex-grow-1 ng-tns-c131-2']";
    public static final String OPTION_LOGIN_MANUALLY_BUTTON = "xpath://a[@class='cl-d-block cl-text-center ng-tns-c131-2 ng-star-inserted']";

    //Elementos Form logueo Manual
    public static final String EMAIL_MANUALLY = "xpath://input[@id='email']";
    public static final String PASSWORD_MANUALLY = "xpath://input[@id='password']";
    public static final String LOGIN_BUTTON_MANUALLY = "xpath://button[@data-test-id='login-button']";

   //Opción de logueo con google
    public static final String EMAIL_GOOGLE = "id:identifierId";
    public static final String EMAIL_NEXT_BUTTON_GOOGLE = "xpath://span[normalize-space()='Siguiente']";
    public static final String PASSWORD_GOOGLE = "name:Passwd";
    public static final String CONTINUE_BUTTON_GOOGLE = "xpath://span[normalize-space()='Continue']";

    public static final String AGREE_TYC_LABEL_CLOCKIFY = "id:agreeCake"; //"xpath://label[@for='agreeCake']";
    public static final String REGISTER_BUTTON_CLOCKIFY = "xpath://button[@type='submit']";


    //Verificaciones o mensajes de error
    public static final String HOME_DIV = "xpath://div[@class='cl-row cl-align-items-center cl-pl-lg-2 cl-py-2 cl-py-lg-custom-0 cl-w-100']";
    public static final String INVALID_EMAIL_SPAN = "xpath://a[@class='ng-tns-c131-2']";
    public static final String INVALID_EMAILPASS_SPAN = "xpath://span[@class='ng-tns-c131-2 ng-star-inserted']";
}
