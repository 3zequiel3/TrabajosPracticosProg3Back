
# Practicos

Esta aplicación Java permite ejecutar distintos Trabajos Prácticos (TPs) de forma automatizada dentro de un contenedor Docker. La selección del TP a ejecutar se realiza mediante la variable de entorno TP_SELECT, definida en el archivo .env y utilizada por Docker Compose.



## Como Ver Los TP

Se levanta el contenedor con:

```bash
  docker compose up -d --build
```

Si se tiene Docker Desktop se visualiza desde los logs del contenedor, sino:

```bash
  docker ps -a
  docker logs <Hash del contenedor>
```






## Como Cambiar entre Tps

Por ahora hay una variable de entorno en la raiz del proyecto, esta dentro tiene configuraciones de DB, Puertos y tambien la variable en la que se selecciona el TP
```bash
  TP_SELECT = X;
```

Desde ahi y haciendo un:
```bash
  ./gradlew clean build
```
Se puede cambiar la variable que usa el selector para elegir el TP.

