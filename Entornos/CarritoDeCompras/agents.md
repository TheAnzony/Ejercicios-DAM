---
description: "Instrucciones de workspace para actualizaciones de código y documentación"
---

Cada vez que se actualice el código en este proyecto:

1. **Documentación Javadoc:** - Asegúrate de que todas las clases, métodos públicos y campos tengan comentarios Javadoc apropiados.
   - Incluye siempre `@param`, `@return` y `@throws`.
   - Evita comentarios obvios; aporta valor sobre *por qué* existe el método si es complejo.

2. **Clean Code & Estructura:**
   - Mantén los principios SOLID y evita la duplicación de código.
   - Asegúrate de que las nuevas dependencias se gestionen correctamente en el archivo de configuración (pom.xml/build.gradle) si aplica.

3. **Mantenimiento del README.md:**
   - Refleja cambios en la estructura de carpetas.
   - Si se añade una nueva funcionalidad, incluye un ejemplo de uso en bloques de código Java.

Estas instrucciones aplican a todos los archivos Java en el directorio "Entornos/CarritoDeCompras/".