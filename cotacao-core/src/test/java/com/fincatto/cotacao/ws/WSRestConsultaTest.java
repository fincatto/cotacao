package com.fincatto.cotacao.ws;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Indice;

public class WSRestConsultaTest {

    @Test
    public void testFatorAcumuladoTaxaSelic() throws RemoteException {
        final Cotacao cotacao = new WSConsulta().getCotacao(Indice.SELIC_FATOR_ACUMULADO, LocalDate.of(2017, 6, 1));
        final Cotacao cotacaoEsperada = new Cotacao(LocalDate.of(2017, 6, 1), Indice.SELIC_FATOR_ACUMULADO, new BigDecimal("1.00808869"));
        Assert.assertNotNull(cotacao);
        Assert.assertEquals(cotacaoEsperada, cotacao);
    }
}
