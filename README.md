# TareaMicroServiciosArep

# Repositorios Relacionados:
- https://github.com/DeividMedina30/tareaArepMicroServicioFeed.git
- https://github.com/DeividMedina30/TareaArepMicroServiciosPost.git
- um

## Autores: 
- Deivid Sebastian Medina
- Jonathan Camilo Pulido
- Eduardo Ospina Mejia 

### Introduccion.

Para la Tarea usted debe:

1) En grupos de máximo 3.
2) Diseñe un API y cree un monolito  Web en Spark que permita a los usuarios hacer posts de 140 caracteres e ir registrandolos en un stream único de posts (a la Twitter). Piense en tres entidades Usuario, hilo(stream), posts.
3) Separe el monolito en tres microservicios independientes.
4) Cree un aplicación JS para usar el servicio. Depliegue la aplicación en S3. Asegúrese que esté disponible sobre internet.
5) Pruebe la aplicación Web
6) Agregue seguridad usando JWT con el servicio cognito de AWS.
7) Despliegue el seervicio en AWS con EC2 y realice pruebas.
    

### Pre Requisitos

1) El estudiante conoce Java, Maven
2) El estudiante sabe desarrollar aplicaciones web en Java
3) Tiene conocimientos de manejo de S3
4) Tiene conocimiento de manejo de EC2
5) Tiene conocimientos de manejo de aws Cognito.

### Descripción

Se creo un servicio principal de facil acceso donde se pueden hacer comentarios para facilitar la interacción entre los usuarios, ademas es un servicio seguro ya que se esta usando validaciones de usuarios y contraseña


### Entregables

1) Entregue el código desarrollado en Github.
2) un reporte de las pruebas.
3) y un video con el experimento funcionando y bien configurado.

### Desarrollo

Se creo inicialmente el monolito con los servicios para entender su funcionamiento de forma general, una vez se comprendio se dividio en 3 microservicios(login, post, feed) para facilitar su crecimiento, con esto llegamos a la arquitectura actual donde es facil entenderla y  saber que responsabilidades tiene cada uno, addemas de esto el servicio de autenticación usado es aws cognito el cual permite registrar usuarios y validarlos para asegurarnos que tenemos la seguridad necesaria para la aplicación, una vez se valida el usuario se crea un token para facilitar las siguientes peticiones.

### AWS
se repiten lo sismo pasos para cada una de las maquncas y se crean 3 EC2 en donde en cada una se monta un servidor utilizado para 
solucionar el proyecto ocmpletmanete, los siguientes screenshots muestran los procedimientos necesarios. 

![](https://i.postimg.cc/Wpy9TnHn/Capture1.png)

![](https://i.postimg.cc/y8mnhzYQ/Capture2.png)

![](https://i.postimg.cc/MGtD4bB1/Capture3.png)

![](https://i.postimg.cc/Qttbr9gw/Capture4.png
)
![](https://i.postimg.cc/PxRMfX2x/Capture5.png)

![](https://i.postimg.cc/yx3ykMbT/Capture6.png)

![](https://i.postimg.cc/59XhB6cs/Capture7.png)

![](https://i.postimg.cc/g2W1bsx7/Capture8.png)

![](https://i.postimg.cc/5NcR8gSt/Capture9.png)

![](https://i.postimg.cc/7YgQ9zKn/Capture10.png)

![](https://i.postimg.cc/8zNX0C3Q/Capture11.png)

![](https://i.postimg.cc/pddGP6Rs/Capture12.png)

![](https://i.postimg.cc/wvywmRtJ/Capture13.png)

![](https://i.postimg.cc/FRMDgFc6/Capture14.png)

#### Cognito: 

![](https://i.postimg.cc/LXcSLGd6/Capture1.png)

![](https://i.postimg.cc/2jWrrjvq/Capture2.png)

![](https://i.postimg.cc/5NM10cqs/Capture3.png)

![](https://i.postimg.cc/CLH0nvcS/Capture4.png)

![](https://i.postimg.cc/CxcVmRy2/Capture5.png)

![](https://i.postimg.cc/k5DPZ7qg/Capture6.png)

![](https://i.postimg.cc/43MRRjxb/Capture7.png)

![](https://i.postimg.cc/PJnGPZZC/Capture8.png)

![](https://i.postimg.cc/brx7bJH3/Capture9.png)

![](https://i.postimg.cc/xjLDBxDM/Capture10.png)

![](https://i.postimg.cc/HsHDmwdK/Capture11.png)

![](https://i.postimg.cc/jSFFDPYR/Whats-App-Image-2022-04-20-at-11-41-08-PM.jpg)

![](https://i.postimg.cc/vmxSfTGf/Whats-App-Image-2022-04-20-at-11-42-28-PM.jpg)

![](https://i.postimg.cc/RFcspY60/Whats-App-Image-2022-04-20-at-11-42-40-PM.jpg)

![](https://i.postimg.cc/90Cx6BZY/Whats-App-Image-2022-04-20-at-11-43-16-PM.jpg)

![](https://i.postimg.cc/qqwm4CGV/Whats-App-Image-2022-04-20-at-11-43-31-PM.jpg)

![](https://i.postimg.cc/NGkC1WvJ/Whats-App-Image-2022-04-20-at-11-43-56-PM.jpg)

![](https://i.postimg.cc/KvcqQJZZ/Whats-App-Image-2022-04-20-at-11-44-52-PM.jpg)

![](https://i.postimg.cc/J4TTFZnj/Whats-App-Image-2022-04-20-at-11-45-16-PM.jpg)

![](https://i.postimg.cc/9Xb14Zys/Whats-App-Image-2022-04-20-at-11-46-53-PM.jpg)

![](https://i.postimg.cc/CLK7b5N5/Whats-App-Image-2022-04-20-at-11-48-00-PM.jpg)

![](https://i.postimg.cc/VvJSLxqf/Whats-App-Image-2022-04-20-at-11-51-39-PM.jpg)

#### S3

![](https://i.postimg.cc/wvGvPwSS/Captures1.png)

![](https://i.postimg.cc/V5yNsdsg/Captures2.png)

![](https://i.postimg.cc/MZnbGNKf/Captures3.png)

![](https://i.postimg.cc/fW17SCJ2/Captures4.png)

![](https://i.postimg.cc/dtd22CCq/Captures5.png)

![](https://i.postimg.cc/4xgzB3vp/Captures6.png)

![](https://i.postimg.cc/0y073qZF/Captures7.png)

![](https://i.postimg.cc/8CyMpB2b/Captures8.png)

### Requisitos:
1)   [Java 8](https://www.java.com/download/ie_manual.jsp)
2)   [Maven](https://maven.apache.org/download.cgi)
3)   [Git](https://git-scm.com/downloads)
4)   IDE de java.

### Solucion.

Esta solucion es una muestra del funcionamiento de las nuevas tendencias de uso de rest api donde se dividen las funciones en diferentes proyectos para asi poder diseñar soluciones mas desacopladas, escalables y facilitar el mantenimiento de las mismas
![](https://i.postimg.cc/hvr4xyPd/Arep.png)
