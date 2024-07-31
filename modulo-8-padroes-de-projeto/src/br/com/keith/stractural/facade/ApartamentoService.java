package br.com.keith.stractural.facade;

public class ApartamentoService implements IApartamentoService {
    /**
     * @param apartamento 
     * @return
     */
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);

        if (isCadastrado && isCamposValidos) {
            return false;
        }
        return true;
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //Logica de cadastrado
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        // Ir no banco e verificar se esta cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        return true;
    }
}
