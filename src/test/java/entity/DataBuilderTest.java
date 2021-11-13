package entity;

import builder.DataBuilder;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataBuilderTest {
  @Test
  public void OrdemComId() {

    Order obj = DataBuilder.ordemComId()
                           .create();
    assertThat(obj.getIdOrder(), is(obj.getIdOrder()));
  }

  @Test
  public void OrdemComIdRandom() {

    Order obj = DataBuilder.ordemComIdRandom()
                           .create();
    assertThat(obj.getCatBreed(), is(obj.getCatBreed()));
  }
}