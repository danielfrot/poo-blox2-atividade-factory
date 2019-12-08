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
public class ConcreteFactoryFiat implements FactoryCar{
    @Override
    public Car makeCar(CarModels model) throws Exception{
        
        switch(model){
            case Uno: return new Uno();
            case Palio: return new Palio();
            case Toro: return new Toro();
            default: throw new Exception("choose a car built in this factory (only Fiat)");
        }
    }
}
