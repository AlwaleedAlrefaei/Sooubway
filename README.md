# Designing the Sooubway Sandwich

## Approach 1: The Subclass Explosion (One Class per Combo)

* **How it works:** You write a completely unique subclass for every single pairing of sandwich and topping.
* **Examples:** You would end up with classes like `TunaWithMayonnaise`, `VeggieWithFeta`, or `ChickenWithChipotleHotSauce`.
* **The Catch:** This creates an absolute nightmare for code maintenance. Every time the restaurant introduces a new sauce or bread, the number of subclasses multiplies exponentially.

## Approach 2: The Mega Base Class (Using Boolean Flags)

* **How it works:** You create one main abstract `Sandwich` class that contains a boolean variable for every possible condiment on the menu (e.g., `hasRanch`, `hasBlueCheese`). Subclasses figure out the total cost by calling the parent class's `getPrice()` method to add up all the "true" toppings.
* **The Catch:** It is highly inflexible. Whenever the menu changes or prices fluctuate, you are forced to modify the core base class. Furthermore, simple boolean flags make it incredibly difficult to handle customer requests like "double meat" or "extra mayo."

## Approach 3: The Decorator Pattern (The Ideal Solution)

* **How it works:** Both the core sandwiches and the add-on condiments implement the exact same `Sandwich` interface (or abstract type). You "wrap" a sandwich in a topping by passing the core sandwich object directly into the condiment's constructor.
* **The Result:** The main program interacts with the outermost layer thinking it is just talking to a standard sandwich. In reality, it is talking to a **Condiment Wrapper (Decorator)** that seamlessly tacks on its own price and behavior to the underlying sandwich.
