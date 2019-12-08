/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Daniel
 */
public class Camaro implements Car{
    @Override
    public String getInfo() {
        return "\n Model: Camaro \n Maker: Chevrolet";
    }
}
