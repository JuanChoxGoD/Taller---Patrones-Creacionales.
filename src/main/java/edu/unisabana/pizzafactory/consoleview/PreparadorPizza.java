
package edu.unisabana.pizzafactory.consoleview;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.PizzaDelgadaFactory;
import edu.unisabana.pizzafactory.model.PizzaFactory;
import edu.unisabana.pizzafactory.model.Tamano;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    private final PizzaFactory factory;

    public PreparadorPizza(PizzaFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        try {
            PizzaFactory factory = new PizzaDelgadaFactory(); 
            
            Ingrediente[] ingredientes = {
                new Ingrediente("queso", 1),
                new Ingrediente("jamon", 2)
            };

            PreparadorPizza pp = new PreparadorPizza(factory);
            pp.prepararPizza(ingredientes, Tamano.MEDIANO);

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName())
                  .log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
        }
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador am = factory.crearAmasador();
        Moldeador mp = factory.crearMoldeador();
        Horneador hpd = factory.crearHorneador();

        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }
        aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!: {0}", Arrays.toString(ingredientes));

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}