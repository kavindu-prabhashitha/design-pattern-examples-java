# Adapter Design Pattern

The Adapter design pattern is a structural pattern in software engineering. It allows objects with incompatible interfaces to work together by providing a wrapper or adapter that translates one interface into another.

Here's a brief explanation of the Adapter design pattern:
1. Intent:
  - The Adapter pattern is used to make two incompatible interfaces work together seamlessly.
  - It acts as a bridge between classes or objects with different interfaces.
    
2. Components:
  - Target: This is the interface that the client code expects to interact with.
  - Adaptee: This is the existing class or component that has an incompatible interface.
  - Adapter: This is the class that wraps the Adaptee and implements the Target interface. It translates calls from the Target interface to the Adaptee's interface

3. How it works:
  - The client code interacts with the Target interface, not knowing that the underlying implementation is provided by the Adapter
  - The Adapter class contains an instance of the Adaptee and translates calls from the Target methods to the corresponding Adaptee methods.

4. Use cases:
  - When integrating new components into an existing system that has a different interface.
  - When reusing legacy code that doesn't match the current required interface.
  - When creating a unified interface for multiple similar classes or components.
