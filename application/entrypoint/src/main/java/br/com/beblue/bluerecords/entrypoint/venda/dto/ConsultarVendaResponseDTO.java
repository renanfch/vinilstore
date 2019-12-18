package br.com.beblue.bluerecords.entrypoint.venda.dto;

import br.com.beblue.bluerecords.entrypoint.paginacao.PaginavelDTO;

import java.time.LocalDate;
import java.util.List;

public class ConsultarVendaResponseDTO implements PaginavelDTO {

    public ConsultarVendaResponseDTO(Integer id, Integer idCliente, LocalDate dataVenda, List<ConsultarVendaItemResponseDTO> itens) {
        this.id = id;
        this.idCliente = idCliente;
        this.dataVenda = dataVenda;
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public List<ConsultarVendaItemResponseDTO> getItens() {
        return itens;
    }

    private Integer id;
    private Integer idCliente;
    private LocalDate dataVenda;
    private List<ConsultarVendaItemResponseDTO> itens;


}
