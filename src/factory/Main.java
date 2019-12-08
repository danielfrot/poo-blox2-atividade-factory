/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import static factory.CarModels.*;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ConcreteFactoryCar myFact = new ConcreteFactoryCar();
            ConcreteFactoryFiat myFiat = new ConcreteFactoryFiat();
            ConcreteFactoryChevrolet myChevrolet = new ConcreteFactoryChevrolet();

            Car obj1 = myChevrolet.makeCar(Celta);
            Car obj2 = myFiat.makeCar(Palio); // pode colocar o enum direto se o mesmo for importado
            Car obj3 = myChevrolet.makeCar(Camaro);
            Car obj4 = myChevrolet.makeCar(S10);
            Car obj5 = myFiat.makeCar(Uno);
            


            System.out.println("Car 1: "+ obj1.getInfo());
            System.out.println("Car 2: "+ obj2.getInfo());
            System.out.println("Car 3: "+ obj3.getInfo());
            System.out.println("Car 4: "+ obj4.getInfo());
            System.out.println("Car 5: "+ obj5.getInfo());
            Car obj6 = myChevrolet.makeCar(Uno);
            System.out.println("Car 6: "+ obj6.getInfo());
        }catch (Exception ex){
            System.err.println(" - Program Exception: "+ ex.getMessage() + ex.toString());
        }
        
    }
    
}
