## Fancy Data Builders 🌟

This repository contains two Java classes, `DataBuilderConventional` and `DataBuilderLombok`, which are used to create stubs for testing.

1. [DataBuilderConventional](#databuilderconventional)
2. [DataBuilderLombok](#databuilderlombok)
3. [What is a Stub? 🚀](#what-is-a-stub-)

### DataBuilderConventional

This class is used for conventional data building. It provides methods to set the `idOrder` and `catBreed` fields of an `Order` object and then build the object. It also offers three static methods for creating complete `Order` objects:

- ✅ `completeOrderWithId`: Creates an `Order` with a specified ID (randomly generated using `CustomDataFaker.Provides.SinId()`) and a random cat breed (generated using `CustomDataFaker.Provides.CatBreed()`).
- ✅ `completeOrderWithoutId`: Creates an `Order` with a random cat breed (generated using `CustomDataFaker.Provides.CatBreed()`) and without an ID.
- ✅ `completeOrderWithoutCatBreed`: Creates an `Order` with a specified ID (randomly generated using `CustomDataFaker.Provides.SinId()`) and without a cat breed.

**Random Data Source:** The randomness of data is ensured by using `CustomDataFaker` to generate random information.

**Usage Example:**

```java
Order orderWithId = DataBuilderConventional.completeOrderWithId();
Order orderWithoutId = DataBuilderConventional.completeOrderWithoutId();
Order orderWithoutCatBreed = DataBuilderConventional.completeOrderWithoutCatBreed(); 
```

### DataBuilderLombok

This class uses Lombok's `@Builder` annotation to simplify data building. It has an `order` field, and you can use the `builder()` method to initialize it. The class also provides two static methods:

- ✨ `ordemComId`: Creates an `Order` with a fixed ID (111) and a random cat breed (generated using `Faker`).
- ✨ `ordemComIdRandom`: Creates an `Order` with a random ID (generated using `Faker`) and a random cat breed (generated using `Faker`).

**Random Data Source:** The randomness of data is ensured by using the `Faker` library to generate random information.

**Usage Example:**

```java
DataBuilderLombok builder = DataBuilderLombok.ordemComId();
Order orderWithFixedId = builder.create();

DataBuilderLombok builderRandom = DataBuilderLombok.ordemComIdRandom();
Order orderWithRandomId = builderRandom.create();
```

### What is a Stub? 🚀

A stub is a simplified implementation of a class or interface used to simulate the behavior of real objects during tests. In this context, both `DataBuilderConventional` and `DataBuilderLombok` classes are used to create simulated `Order` objects with random or predefined data for testing purposes.

These classes help in isolating the code under test from external dependencies and ensure that the tested code functions correctly in isolation.