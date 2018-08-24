package org.bioe134.helloworld;

import org.bioe134.helloworld.model.Person;

/**Hello there, this is Anita and I am editing the code to see if I can save and push it.
 *
 * @author J. Christopher Anderson
 */
public class MakeGreating {

    private String salutation;

    public void initiate() throws Exception {
        salutation = "Hi ";
    }

    public String run(Person person) throws Exception {
        return salutation + person.getName();
    }
    
    public static void main(String[] args) throws Exception {
        //Create some arguments
        Person betty = new Person("Betty");
        Person bill = new Person("Bill");
        Person bai = new Person("Bai");
        
        //Create the Function and initiate it
        MakeGreating func = new MakeGreating();
        func.initiate();
        
        //Run the function multiple times
        System.out.println(func.run(betty));
        System.out.println(func.run(bill));
        System.out.println(func.run(bai));
    }
}
