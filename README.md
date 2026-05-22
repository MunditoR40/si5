# 💧 SEDACHIMBOTE - Sistema de Gestión de Reclamos y Órdenes de Atención

Este proyecto es el resultado de la Actividad S4-S5 del curso de **Sistemas de Información I** de la **Universidad Nacional del Santa (UNS)**. Consiste en el modelado Orientado a Objetos (UML) y su posterior implementación utilizando Spring Boot y bases de datos en memoria.

## 👥 Integrantes del Equipo
* Royser 
* Giraldo Barreto Eddy - 202114032
* Hinostroza Melo Diego Jeanpiere - 0202414019
* Ángel 

## 🎯 Objetivo del Proyecto
Automatizar el registro de reclamos de los usuarios de SEDACHIMBOTE (agua, desagüe, facturación) y la generación de órdenes de atención asignadas a los técnicos de la empresa, aplicando el paradigma Orientado a Objetos.

## 🛠️ Stack Tecnológico
* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3.x
* **Persistencia:** Spring Data JPA / Hibernate
* **Base de Datos:** H2 Database (En memoria)
* **Modelado:** Diagrama de Clases UML

## 📦 Estructura de Entidades (Modelado OO a BD)
El sistema mapea automáticamente las siguientes clases a tablas relacionales usando JPA:
1. `Usuario` (1 .. * `Reclamo`)
2. `Reclamo` (1 .. 1 `OrdenAtencion`)
3. `Tecnico` (1 .. * `OrdenAtencion`)
4. `OrdenAtencion`

## 🚀 Cómo ejecutar el proyecto
1. Clonar este repositorio.
2. Abrir el proyecto en su IDE de preferencia (IntelliJ IDEA, Eclipse, VS Code).
3. Ejecutar la clase principal `SedachimboteApplication.java`.
4. El servidor embebido Tomcat iniciará en el puerto `8080`.

### 🗄️ Acceso a la Base de Datos H2
Para verificar la creación automática de las tablas generadas por JPA:
* **URL de la consola:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
* **JDBC URL:** `jdbc:h2:mem:sedadb`
* **Username:** `sa`
* **Password:** *(dejar en blanco)*