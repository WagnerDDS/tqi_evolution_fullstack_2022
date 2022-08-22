package tqi.bookstore.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//classe para respostas padrão da API ao inserir / atualizar / deletar / excluir dados.
@Component
@Getter
@Setter
public class ResponseModel {

    private String message;

}
