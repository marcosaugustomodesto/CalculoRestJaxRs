package com.logicbig.example;


import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import br.com.cpim.rest.Calcular;

public class CalcularTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(Calcular.class);
    }

    @Test
    public void calcularSomaTest() {
    	String response = target("calcular/soma/1/1").request().get(String.class);
        Assert.assertTrue("Calculo [a=1, b=1, operacao=adicao, total=2.0, erro=OK]".equals(response));
    }
    @Test
    public void calcularSubtracaoTest() {
    	String response = target("calcular/subtracao/1/1").request().get(String.class);
        Assert.assertTrue("Calculo [a=1, b=1, operacao=subtracao, total=0.0, erro=OK]".equals(response));
    }
    @Test
    public void calcularMultiplicacaoTest() {
    	String response = target("calcular/multiplicacao/2/2").request().get(String.class);
        Assert.assertTrue("Calculo [a=2, b=2, operacao=multiplicacao, total=4.0, erro=OK]".equals(response));
    }
    @Test
    public void calcularDivisao() {
    	String response = target("calcular/divisao/4/2").request().get(String.class);
        Assert.assertTrue("Calculo [a=4, b=2, operacao=divisao, total=2.0, erro=OK]".equals(response));
    }
    @Test
    public void calcularDivisaoPorZero() {
    	String response = target("calcular/divisao/4/0").request().get(String.class);
        Assert.assertTrue("Calculo [a=4, b=0, operacao=divisao, total=0.0, erro=Erro divisao por zero]".equals(response));
    }
}
