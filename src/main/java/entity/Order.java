//Teste no aceita package RAIZ
//Criar um package p/ tds as classes
package entity; //<<< Obrigatorio

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int idOrder;
    private String catBreed;
}
