package com.linkedIn_learning.collections;

public class Application {

    public static void main(String[] args) {

        // Here, we're going to use our 'Contract' interface and its implementation (Implementation).
        // This works because the implementation implements the contract interface. And then we can take that
        // object and pass it to anywhere where the contract interface is accepted.
        Contract contract = new Implementation();
        printTerms(contract);
    }

    private static void printTerms(Contract contract) {
        // As this method has a parameter named contract of the 'Contract' interface, we can use that interface
        // to invoke the methods from the object that implemented that interface.
        contract.term1();
        contract.term2();
    }
}
