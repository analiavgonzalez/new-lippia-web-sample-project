package lippia.web.constants;

public class LogInConstants {

    // BOTONES OPCIONES DE LOGUEO MANUAL Y GOOGLE
    public static final String OPTION_LOGIN_MANUALLY_BUTTON = "xpath://a[@class='cl-d-block cl-text-center ng-tns-c134-2 ng-star-inserted']";

    //Elementos Form logueo Manual
    public static final String EMAIL_MANUALLY = "xpath://input[@id='email']";
    public static final String PASSWORD_MANUALLY = "xpath://input[@id='password']";
    public static final String LOGIN_BUTTON_MANUALLY = "xpath://button[@data-test-id='login-button']";

       //Verificaciones o mensajes de error
    public static final String HOME_DIV = "xpath://div[@class='cl-row cl-align-items-center cl-pl-lg-2 cl-py-2 cl-py-lg-custom-0 cl-w-100']";
    public static final String INVALID_EMAIL_SPAN = "xpath://span[@class='cl-invalid-feedback cl-block cl-mt-0 ng-tns-c134-2 ng-star-inserted']";
    public static final String INVALID_EMAILPASS_SPAN = "xpath://span[@class='ng-tns-c134-2 ng-star-inserted']";
}
