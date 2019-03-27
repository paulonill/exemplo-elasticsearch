package br.com.pjr.exemploelasticsearch.entidade;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Document(indexName = "apiprodutos", type = "produto", shards = 2)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Produto", description = "Informações de produto")
public class Produto {

    private Long id;

    @NotNull
    @ApiModelProperty(value = "Nome do produto", name = "id", dataType = "string")
    private String nome;

    @NotNull
    @ApiModelProperty(value = "Código do produto", name = "id", dataType = "string")
    private String codigo;

    @ApiModelProperty(value = "Descrição do produto", name = "id", dataType = "string")
    private String descricao;

    @NotNull
    @ApiModelProperty(value = "Valor do produto", name = "id", dataType = "number")
    private BigDecimal valor;
}
