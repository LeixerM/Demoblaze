Para Ejecutar el proyecto se debe tener en cuenta las siguientes recomendaciones
2. Debe tener instalado y Configurado Gradle versión 9.0.0
3. Debe tener instalado y Configurado Java versión 21
4. Debe tener instalado y Configurado IDE Intellij IDEA y descargar los plugins de Cucumber para el IDE
5. Importar el proyecto  en Intellij IDEA desde el archivo build.gradle
6. El proyecto se ejecuta desde el archivo runner llamado "DemoblazeBuyRunners" click derecho sale la opción Run DemoblazeBuyRunners 
7. Se despliega en la consola de Intellij IDEA al finalizar la ejecución se visualiza lo siguiente: 
================================================================================
✓ SERENITY REPORT GENERATED SUCCESSFULLY
================================================================================
Report path: file:///C:/Users/HP/IdeaProjects/Demoblaze/target/site/serenity/index.html -> Este es un hipervínculo solo es darle click y se abre el reporte
8. Si se quiere ejecutar por comando terminal es el siguiente código: ./gradlew clean test 
9. Se visualiza lo siguiente:
Generating Serenity Reports
  - Main report: file:///C:/Users/HP/IdeaProjects/Demoblaze/target/site/serenity/index.html -> Este es un hipervínculo solo es darle click y se abre el reporte
      - Test Root: null
      - Requirements base directory: null
10. Si se quiere acceder al reporte desde la estructura de la carpeta es la siguiente :
	10.1 Darle Click en la carpeta Target 
	10.2 Se desglosa varios archivos se debe ubicar el nombrado de la siguiente manera -> index.html 
	10.3 Se da el click en el archivo index.html y se visualiza el reporte

  