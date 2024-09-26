@Project @Regression 
Feature: Creación de proyectos
  
  Background: 
  Given el usuario está logueado en la página de Clockify
	And el usuario tiene asignado un workspace 
	And el usuario se encuentra en la pantalla de Proyectos
  
@CreateProject @Smoke @SuccessfulScenario
Scenario Outline: Creación exitosa de un nuevo proyecto publico
And no existe un proyecto con nombre <project_name> y cliente <client> 
When el usuario presiona el botón "Create new project"
And el usuario ingresa el nombre de proyecto <project_name> 
And el usuario selecciona el cliente <client> 
And el usuario selecciona el valor publico <public> para indicar que es publico
And el usuario selecciona el color de proyecto <project_color> 
And el usuario presiona el botón "Create"
Then el usuario visualiza el nuevo proyecto en el listado de proyectos existentes.

Examples:
| project_name		| client		| public	| project_color	|
| TP Examen Final	| Miss Klap		| Si		| marron		|
| Proyecto Z		| Mr Smith		| Si	 	| azul			|


@CreateProject @Smoke @SuccessfulScenario
Scenario Outline: Creación exitosa de un nuevo proyecto privado
And no existe un proyecto con nombre <project_name> 
When el usuario presiona el botón "Create new project"
And el usuario ingresa el nombre de proyecto <project_name> 
And el usuario selecciona el valor privado <privado> para indicar que es privado
And el usuario selecciona el color de proyecto <project_color> 
And el usuario presiona el botón "Create"
Then el usuario visualiza el nuevo proyecto en el listado de proyectos existentes.

Examples:
| project_name		| client		| privado	| project_color	|
| FT Final			| Mr Mc Coubrey	| No 		| amarillo		|
| Proyecto Y		| 				| No 		| verde			|



@CreateProject @Smoke @FailedScenario
Scenario: Creación fallida de un nuevo proyecto publico con nombre existente
And el proyecto con nombre "TP Examen Final" ya existe
And el cliente "Miss Klap" ya existe
When el usuario presiona el botón "Create new project"
And el usuario ingresa el nombre de proyecto "TP Examen Final" 
And el usuario ingresa el cliente "Miss Klap"
And el usuario selecciona si es publico "Si"
And el usuario selecciona el color de proyecto "marron"
And el usuario presiona el botón "Create"
Then el usuario visualiza mensaje de error indicando que "el proyecto para el cliente ya existe"


@SearchProject @Smoke @SuccessfulScenario
Scenario Outline: Busqueda exitosa de proyectos por estado <filtro_estado>
And existen proyectos cargados
When el usuario selecciona el filtro <filtro_estado>
And el usuario presiona el botón "Apply Filter"
Then el usuario visualiza el listado de proyectos para el filtro seleccionado

Examples: 
| filtro_estado	|
| activo		|
| archivo		|
| todo			|


@SearchProject @Smoke @SuccessfulScenario
Scenario Outline: Busqueda exitosa de proyectos por cliente <clientes>
And existen proyectos cargados
And el cliente <clientes> existe
When el usuario hace click en la opción de filtro "cliente" 
And el usuario selecciona el cliente <clientes>
And el usuario presiona el botón "Apply Filter"
Then el usuario visualiza el listado de proyectos para el filtro seleccionado

Examples: 
| clientes		|
| Miss Klap		|
| Mr Smith		|
| Mr Mc Coubrey	|

@SearchProject @Smoke @SuccessfulScenario
Scenario Outline: Busqueda exitosa de proyectos por filtro facturación <filtro_facturable>
And existen proyectos cargados
When el usuario hace click en la opción de filtro "facturación" 
And el usuario selecciona el filtro <filtro_facturable>
And el usuario presiona el botón "Apply Filter"
Then el usuario visualiza el listado de proyectos para el filtro seleccionado

Examples: 
| filtro_facturable	|
| Facturable		|
| No Facturable		|


@SearchProject @Smoke @SuccessfulScenario
Scenario Outline: Busqueda exitosa por nombre de proyecto
And existen proyectos cargados
When el usuario selecciona el filtro nombre <nombre>
And el usuario presiona el botón "Apply Filter"
Then el usuario visualiza el proyecto <nombre> en el listado

Examples: 
| nombre		|
| hola mundo	|
| tp		    |


@CreateProject @Smoke @FailedScenario
Scenario Outline: Creación fallida de un proyecto
When el usuario presiona el botón "Create new project"
And el usuario ingresa el nombre de proyecto <project_name> 
And el usuario ingresa el cliente <client> 
And el usuario selecciona si es publico <public> 
And el usuario selecciona el color de proyecto <project_color> 
And el usuario presiona el botón "Create"
Then el usuario visualiza el mensaje <message> 

Examples:
| project_name						| client	| public	| project_color	| message																  |
| <script>vulnerabilidad</script>	| Mr Client	| true		| marron	    | Has introducido un valor incorrecto. No uses los caracteres &lt; y &gt; |
|    							    | Mr Smith	| false 	| azul		   	| El nombre del proyecto debe tener entre 2 y 250 caracteres			  |
| Examen Final						|         	| true	 	| rojo		   	| Proyecto Examen Final para el cliente ya existe                         |
| select * from users	            |         	| true	 	| verde		   	| Se ha creado el proyecto                                                |


@DeactivateProject @SuccessfulScenario
Scenario: Desactivar un proyecto exitosamente 
And el proyecto "hola mundo" existe
When el usuario selecciona el "ícono de 3 puntos" del proyecto "hola mundo"
And el usuario selecciona la opcion "archivar"
And el usuario confirma la acción y presiona el botón "archivar"
Then el usuario visualiza mensaje indicando "proyecto actualizado con exito"
And el usuario visualiza el nombre de proyecto "hola mundo" tachado en la lista de proyectos


@DeleteProject @SuccessfulScenario
Scenario: Eliminación exitosa de un proyecto
And el proyecto "hola mundo" existe y se encuentra desactivado
When el usuario selecciona el "ícono de 3 puntos" del proyecto "hola mundo"
And el usuario selecciona la opcion "eliminar"
And el usuario confirma la acción y presiona el botón "eliminar"
Then el usuario visualiza mensaje indicando "proyecto eliminado con exito"
And el usuario no visualiza el proyecto "hola mundo" en la lista de proyectos
