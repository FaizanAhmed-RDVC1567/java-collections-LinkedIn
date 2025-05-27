package com.linkedIn_learning.collections;

/*
* The purpose of this interface in the course, is to explain the concept of an interface using the commonly
* used term 'contract'. Here, the tutor describes abstract methods that will be implemented by the class
* that implements this interface. Also, the tutor states that the interface cannot be instantiated on its
* own and demonstrates that whatever class implements the interface must also implement and (override?)
* the abstract method. The abstract method defines the roles and terms for a class. Any abstract methods
* on the interface must appear on a class known as an implementation. Then, the implementation class must
* implement that abstract method, otherwise the compiler will throw an error.
* */

public interface Contract extends ExtendedContract{

    public void term1();

    public void term2();
}
