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
public interface FactoryCar {
    //Car makeCar(CarModels model);
    Car makeCar(CarModels model)throws Exception;
     
}
