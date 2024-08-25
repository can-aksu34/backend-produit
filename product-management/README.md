# Gestion de Produits - Java Spring Boot

Cette application est un système de gestion de produits simple, développé en utilisant Java Spring Boot. Elle fournit une API REST permettant de créer, lire, mettre à jour et supprimer des produits.

## Prérequis

- Java 17 ou supérieur
- Maven 3.8.1 ou supérieur
- Spring Boot 3.3.2

## Installation

1. Clonez le dépôt :

    ```bash
    git clone https://github.com/votre-utilisateur/votre-repo.git
    cd product-management
    ```

2. Compilez et packagez l'application avec Maven :

    ```bash
    mvn clean install
    ```

3. Démarrez l'application Spring Boot :

    ```bash
    mvn spring-boot:run
    ```

4. L'application sera disponible à l'adresse `http://localhost:8080`.

## Documentation de l'API

Vous pouvez explorer et tester l'API via l'interface Swagger disponible à l'adresse suivante :

[Swagger Documentation](http://localhost:8080/docs)

## Collection Postman

Une collection Postman a été préparée pour faciliter les tests de l'API. Vous pouvez l'importer dans Postman en utilisant le lien ci-dessous :

[Collection Postman](https://api.postman.com/collections/32194924-fd4f41d6-0a6b-401b-a901-ccd733ed287e?access)

## Structure du Projet

- `com.alten.product_management.controller.ProductController` : Contient les endpoints de l'API pour gérer les produits.
- `com.alten.product_management.model.Product` : Représente le modèle de données pour un produit.
- `com.alten.product_management.service.ProductService` : Contient la logique métier pour les opérations sur les produits.



## Merci d'avance pour votre relecture :)

