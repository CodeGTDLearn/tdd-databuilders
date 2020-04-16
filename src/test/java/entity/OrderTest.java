package entity;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static builder.OrderBuilder.CriarOrdemComId111;
import static builder.OrderBuilder.CriarOrdemComId222;
import static org.hamcrest.CoreMatchers.is;

public class OrderTest {
    @Test
    public void test111() {
        Order obj = CriarOrdemComId111().gerar();
        assertThat(obj.getIdOrder(), is(111));
    }

    @Test
    public void test222() {
        Order obj = CriarOrdemComId222().gerar();
        assertThat(obj.getIdOrder(), is(222));
    }
}