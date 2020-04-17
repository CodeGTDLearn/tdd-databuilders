package entity;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static builder.OrderBuilder.ordemDeAdocaoComId111;
import static builder.OrderBuilder.ordemDeAdocaoComIdRandom;
import static org.hamcrest.CoreMatchers.is;

public class OrderTest {
    @Test
    public void test111() {
        Order obj = ordemDeAdocaoComId111().gerar();
        assertThat(obj.getIdOrder(), is(obj.getIdOrder()));
    }

    @Test
    public void test222() {
        Order obj = ordemDeAdocaoComIdRandom().gerar();
        assertThat(obj.getCatBreed(), is(obj.getCatBreed()));
    }
}