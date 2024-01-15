package com.raphaelscandura.apimedvoll.medico;

import com.raphaelscandura.apimedvoll.endereco.enderecoData;

public record medicoData(String nome, String email, String crm, Especialidade especialidade, enderecoData endereco) {
}
