package com.linkedIn_learning.collections;

public interface ExtendedContract {
    // The final part of the section concerns the topic of inheritance. An interface can extend another
    // interface. When that happens, and a developer specifies an abstract method in the super (interface),
    // it must be implemented in the implementation that implements the base interface that inherited the
    // parent interface. If that does not happen,the IDE/compiler will again complain about the conditions
    // for the 'contract' not being met.

    public void extendedTerm();
}
