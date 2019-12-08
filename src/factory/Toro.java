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
public class Toro implements Car{
    @Override
    public String getInfo() {
        return "\n Model: Toro \n Maker: Fiat";
    }
}
