package sg.edu.nus.iss;

@FunctionalInterface  // optional to add this

// "T" is a generic type (e.g. can be integer, string, double)
public interface MyRunnableInterface<T> {
    
    // This is a function signature. There is no implementation in interface.
    // The implementation will be another file (e.g. main application)
    T process(T a, T b);
    // <return type> <method name>(parameters)
}
