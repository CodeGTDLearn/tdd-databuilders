package entity;

import builder.DataBuilderLombok;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataBuilderLombokTest {
  @Test
  public void OrdemComId() {

    Order obj = DataBuilderLombok.ordemComId()
                                 .create();
    assertThat(obj.getIdOrder(), is(obj.getIdOrder()));
  }

  @Test
  public void OrdemComIdRandom() {

    Order obj = DataBuilderLombok.ordemComIdRandom()
                                 .create();
    assertThat(obj.getCatBreed(), is(obj.getCatBreed()));
  }
}