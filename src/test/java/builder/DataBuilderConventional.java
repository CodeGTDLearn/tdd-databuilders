//Teste nao aceita package RAIZ /// Criar um package p/ tds as classes
package builder;//<<< Obrigatorio

import entity.Order;
import utils.CustomDataFaker;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;


public class DataBuilderConventional {

  private int idOrder;
  private String catBreed;

  public DataBuilderConventional setIdOrder(int idOrder) {

    this.idOrder = idOrder;
    return this;
  }

  public DataBuilderConventional setCatBreed(String catBreed) {

    this.catBreed = catBreed;
    return this;
  }

  public Order build() {

    return new Order(idOrder, catBreed);
  }

  public static Order completeOrderWithId() {

    return new DataBuilderConventional()
         .setIdOrder((int) CustomDataFaker.Provides.RandomDouble())
         .setCatBreed(CustomDataFaker.Provides.CatBreed())
         .build();
  }

  public static Order completeOrderWithoutId() {

    return new DataBuilderConventional()
         .setCatBreed(CustomDataFaker.Provides.CatBreed())
         .build();
  }

  public static Order completeOrderWithoutCatBreed() {

    return new DataBuilderConventional()
         .setIdOrder((int) CustomDataFaker.Provides.RandomDouble())
         .build();
  }

  public static void main(String[] args) {

    Order order =
         new DataBuilderConventional()
              .setIdOrder(1)
              .setCatBreed("Siamese")
              .build();
  }

}