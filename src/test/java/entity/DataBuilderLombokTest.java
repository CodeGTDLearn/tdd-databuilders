package entity;

import builder.DataBuilderLombok;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataBuilderLombokTest {
  @Test
  public void OrdemWithId() {

    Order obj = DataBuilderLombok.orderWithId().create();
    assertThat(obj.getIdOrder(), is(obj.getIdOrder()));
  }

  @Test
  public void OrdemWithIdRandom() {

    Order obj = DataBuilderLombok.ordemWithIdRandom().create();
    assertThat(obj.getCatBreed(), is(obj.getCatBreed()));
  }
}