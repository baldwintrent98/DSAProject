# DSAProject
We need ADTs for the following elements
Customers in shopping center - 
Each costumers cart -
Checkout lines - 

Helping classes
Customer
    String name
    List<Item> items
Store
    int Restock amount (for all items, its the same)
    List<Item> items
    Queue express
    Queue regular1
    Queue regular2
    int time //increments for every customer who can successfully add or remove an item from their cart
    Queue shoppers //When Option 4, customer is done shopping, place into shortest checkout line. Read bullet 5

    checkOutCustomer(), after doing so prompt if they want to shop again. Enqueue to the list of shoppers and empty cart. Do not make a new Customer object.
    

Item
    String name
    int amount