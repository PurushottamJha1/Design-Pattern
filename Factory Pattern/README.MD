# Pizza Restaurant

This project illustrates the usage of the Factory Pattern in a pizza restaurant scenario.

## Description

The project consists of classes representing different types of pizzas and a PizzaFactory class responsible for creating instances of these pizzas based on the type requested.

## Usage

1. Create a PizzaFactory instance.
2. Use the orderPizza method of PizzaStore to order different types of pizzas by specifying their type (e.g., "Cheese", "Pepperoni", "Vegetarian").
3. The PizzaStore will create and process the requested pizza based on the provided type.

## Classes

- `BasePizza`: Abstract base class for different types of pizzas.
- `CheesePizza`, `PepperoniPizza`, `VegetarianPizza`: Concrete subclasses representing specific types of pizzas.
- `PizzaFactory`: Factory class responsible for creating instances of pizzas based on the requested type.
- `PizzaStore`: Client class handling the ordering and processing of pizzas.

## Benefits of Factory Pattern

- Encapsulates object creation logic.
- Centralizes creation code, improving code maintainability.
- Decouples client code from the implementation details of object creation.

