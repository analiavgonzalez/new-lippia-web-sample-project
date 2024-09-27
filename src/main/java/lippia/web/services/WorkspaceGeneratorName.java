package lippia.web.services;

import java.util.Random;

public class WorkspaceGeneratorName {

    private static final String[] name = {
            "Test ", "Prueba ", "Workspace "
    };

    private static final Random random = new Random();

    public static String generateWorkspaceName() {
        String WorkspaceName = name[random.nextInt(name.length)];
        int randomNumber = random.nextInt(100); // Genera un número entre 0 y 99
        return WorkspaceName + randomNumber;
    }

//    public void storageWorkspaceName(String workspaceName) {
//        HttpSession session = getCurrentSession();
//
//        session.setAttribute("workspaceName", workspaceName);
//    }
//
//    private HttpSession getCurrentSession() {
//        // Lógica para obtener la sesión
//        // Esto dependerá de cómo esté estructurada tu aplicación
//        return null; // Placeholder: Implementar la lógica para recuperar la sesión
//    }

}
