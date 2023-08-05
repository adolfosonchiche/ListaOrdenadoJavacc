package com.adolfosc.listaordenadajavacc;

import com.adolfosc.analizador.Gramatica;
import com.adolfosc.analizador.ParseException;
import com.adolfosc.analizador.TokenMgrError;
import java.io.StringReader;

/**
 *
 * @author hectoradolfo
 */
public class ListaOrdenadaJavaCC {

    public static void main(String[] args) {
        try {
            StringReader stream = new StringReader("1,3,5,\n5,8,9");
            Gramatica parser = new Gramatica(stream);
            parser.Analizar();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
    }
}
