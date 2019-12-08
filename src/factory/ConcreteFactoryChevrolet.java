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
public class ConcreteFactoryChevrolet implements FactoryCar {
    @Override
    public Car makeCar(CarModels model) {
        switch(model){
            case S10: return new S10();
            case Camaro: return new Camaro();
            case Celta: return new Celta();
            default: throw new IllegalArgumentException("choose a car built in this factory (only Chevrolet)");
        }
    }
}
