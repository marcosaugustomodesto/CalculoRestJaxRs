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
    	System.out.println(response);
        Assert.assertTrue("Calculo de adicao [a=1.0, b=1.0, total = 2.0, erro = OK]".equals(response));
    }
    @Test
    public void calcularSubtracaoTest() {
    	String response = target("calcular/subtracao/1/1").request().get(String.class);
    	System.out.println(response);
        Assert.assertTrue("Calculo de subtracao [a=1.0, b=1.0, total = 0.0, erro = OK]".equals(response));
    }
    @Test
    public void calcularMultiplicacaoTest() {
    	String response = target("calcular/multiplicacao/2/2").request().get(String.class);
    	System.out.println(response);
        Assert.assertTrue("Calculo de multiplicacao [a=2.0, b=2.0, total = 4.0, erro = OK]".equals(response));
    }
    @Test
    public void calcularDivisao() {
    	String response = target("calcular/divisao/4/2").request().get(String.class);
    	System.out.println(response);
        Assert.assertTrue("Calculo de divisao [a=4.0, b=2.0, total = 2.0, erro = OK]".equals(response));
    }
    @Test
    public void calcularDivisaoPorZero() {
    	String response = target("calcular/divisao/4/0").request().get(String.class);
    	System.out.println(response);
        Assert.assertTrue("Calculo de divisao [a=4.0, b=0.0, total = 0.0, erro = Erro divisao por zero]".equals(response));
    }
}
