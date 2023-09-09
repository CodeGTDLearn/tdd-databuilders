package entity;

import builder.DataBuilderConventional;
import builder.DataBuilderLombok;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataBuilderConventionalTest {
  @Test
  public void OrdemWithId() {

    Order obj = DataBuilderConventional.completeOrderWithId();
    assertThat(obj.getIdOrder(), is(obj.getIdOrder()));
  }

  @Test
  public void OrdemWithIdRandom() {

    Order obj = DataBuilderConventional.completeOrderWithoutCatBreed();
    assertThat(obj.getCatBreed(), is(obj.getCatBreed()));
  }
}