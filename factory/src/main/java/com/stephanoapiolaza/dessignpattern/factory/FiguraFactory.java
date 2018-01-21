/*
 * MIT License
 *
 * Copyright (c) [2018] [Stephano Apiolaza]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.stephanoapiolaza.dessignpattern.factory;

import com.stephanoapiolaza.dessignpattern.factory.enumeration.FiguraTipoEnum;
import com.stephanoapiolaza.dessingpattern.factory.impl.Circulo;
import com.stephanoapiolaza.dessingpattern.factory.impl.Cuadrado;
import com.stephanoapiolaza.dessingpattern.factory.impl.Triangulo;

/**
 * Clase que representa el patron de disenno singleton
 * para crear instancias unicas por objeto, ayudando a su 
 * reutilizacion y optimizacion, ideal para realizar tareas
 * de cache
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm}
 * @category Patrones Creacionales
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class FiguraFactory {

    /**
     * Constructor Privado
     */
    private FiguraFactory() {
        
    }
    
    /**
     * Retorna un tipo de figura disponible
     * @param tipoFigura enum con los tipos de figura disponibilizados
     * @return tipo de figura solicitada
     */
    public static Figura getFigura(FiguraTipoEnum tipoFigura) {
        if ( null == tipoFigura ) {
            return null;
        }
        if ( tipoFigura.equals(FiguraTipoEnum.CIRCULO) ) {
            return new Circulo();
        } else if ( tipoFigura.equals(FiguraTipoEnum.CUADRADO) ) {
            return new Cuadrado();
        } else if ( tipoFigura.equals(FiguraTipoEnum.TRIANGULO) ) {
            return new Triangulo();
        }
        return null;
    }
    
}
