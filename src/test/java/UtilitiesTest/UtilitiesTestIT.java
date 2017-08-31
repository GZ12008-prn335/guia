/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilitiesTest;

import javax.inject.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author asus
 */
@RunWith(Arquillian.class)
public class UtilitiesTestIT {
    
    public static WebArchive desplega (){
        WebArchive salida=ShrinkWrap.create(WebArchive.class).addClass(UtilitiesTest.class)
                .addAsWebResource(EmptyAsset.INSTANCE,"beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    @Inject
private UtilitiesTest probando;

@Test
public void probar (){
    String texto= "Hola Mundo";
    String resultado=probando.getResume(texto);
    Assert.assertEquals(texto, resultado);
}
@Test
public void probando (){
    String texto="Hola Mundo";
    String resultado=probando.capitalizar(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void proband (){
    String texto="Hola Mundo";
    String frase="Hola";
    String resultado=probando.contarCoincidencias(frase, texto);
    Assert.assertEquals(texto, resultado);
}
}

