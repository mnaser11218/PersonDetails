package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;
    private String results = "";


    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
       String resulter="";
        // create a `counter`
        int counter = 0;
        Person person;
        // while `counter` is less than length of array
        while(counter < personArray.length){
            resulter = resulter;
            // begin loop
            // use `counter` to identify the `current Person` in the array
            person = personArray[counter];
            // get `string Representation` of `currentPerson`
            resulter += person.toString();
            //this.setResults(this.getResults() + person.toString());
            // append `stringRepresentation` to `result` variable
            counter++;
            // end loop

        }

        return resulter;
    }



    public String forLoop() {
        String result = "";

        for(int i=0; i< personArray.length; i++){
            // use the above clauses to declare for-loop signature
            // begin loop
            result = result;
            // use `counter` to identify the `current Person` in the array
            Person person = personArray[i];
            result+= person.toString();
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }



        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for(Person i : personArray){
            result = result;
            result+= i.toString();
        }

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
