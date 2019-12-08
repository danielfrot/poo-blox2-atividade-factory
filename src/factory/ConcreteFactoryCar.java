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
public class ConcreteFactoryCar implements FactoryCar {

    @Override
    public Car makeCar(CarModels model) {
        switch(model){
            case Celta: return new Celta();
            case Palio: return new Palio();
            default: return null;
        }
    }
    
}
