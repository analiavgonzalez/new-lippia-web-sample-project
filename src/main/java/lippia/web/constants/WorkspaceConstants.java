package lippia.web.constants;

public class WorkspaceConstants {
    public static final String CONFIG_BUTTON = "xpath://img[@alt='Workspace dropdown options']";
    public static final String MANAGEW_BUTTON = "xpath://a[normalize-space()='Gestionar espacios de trabajo']";
    public static final String CREATE_BUTTON = "xpath://button[@class='cl-btn cl-btn-outline-primary cl-d-none-print']";
    public static final String WORKSPACE_NAME_TEXT = "xpath://input[@type='text']";
    public static final String CREATE_NEW_BUTTON = "xpath://button[@type='submit']";
    public static final String MSG_SUCCESSFUL_CREATION = "xpath://div[@aria-label='Se ha creado el espacio de trabajo test.']";

    public static final String WORKSPACE_NAME_EDITION = "xpath://input[@id='workspaceName']";
    public static final String SEARCH_ANI_WORKSPACE = "xpath://div[contains(@class, 'cl-cut-text-wrapper cl-my-2 cl-my-lg-0 cl-px-2 cl-px-lg-3 cl-w-100')]//span[normalize-space(text())='Ani workspace']/ancestor::div[contains(@class, 'cl-d-flex cl-flex-column cl-flex-lg-row cl-w-100 cl-align-items-start cl-align-items-lg-center cl-justify-content-start cl-justify-content-lg-between')]//div[contains(@class, 'ng-star-inserted')]//button[normalize-space(text())='Configuración']";
    public static final String SEARCH_UPDATED_WORKSPACE = "xpath://div[contains(@class, 'cl-cut-text-wrapper cl-my-2 cl-my-lg-0 cl-px-2 cl-px-lg-3 cl-w-100')]//span[normalize-space(text())='Update workspace']/ancestor::div[contains(@class, 'cl-d-flex cl-flex-column cl-flex-lg-row cl-w-100 cl-align-items-start cl-align-items-lg-center cl-justify-content-start cl-justify-content-lg-between')]";
}
