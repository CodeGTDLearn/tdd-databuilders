//Teste nao aceita package RAIZ /// Criar um package p/ tds as classes
package builder;//<<< Obrigatorio

import lombok.*;
import entity.Order;

@Builder
public class OrderBuilder {
    private Order ordem; //variavel de instancia: 'ordem'

    public static OrderBuilder CriarOrdemComId111() {
        return OrderBuilder.builder()
                .ordem( //building a variavel de instancia: 'ordem'
                        new Order(111)// carrega variavel de instancia 'ordem'
                ).build();
    }

    public static OrderBuilder CriarOrdemComId222() {
        return OrderBuilder.builder()
                .ordem( //building a variavel de instancia: 'ordem'
                        new Order(222)// carrega variavel de instancia 'ordem'
                ).build();
    }

    public Order gerar() {
        return ordem;// retorna a variavel de instancia 'ordem'
    }
}