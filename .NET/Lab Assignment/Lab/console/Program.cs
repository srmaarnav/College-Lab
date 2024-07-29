// using System;
// class ConsoleApp
// {
//     static void Main(string[] args)
//     {
//         Console.WriteLine("Enter a string:");
//         string? input = Console.ReadLine();
//         if (input != null)
//         {
//             Console.WriteLine("\nConverted string:");
//             Console.WriteLine("To Lowercase: " + input.ToLower());
//             Console.WriteLine("To Uppercase: " + input.ToUpper());
//         }
//         else
//         {
//             Console.WriteLine("No input provided.");
//         }
//     }
// }

// using System;
// class ConsoleApp
// {
//     static void Main(string[] args)
//     {
//         Console.WriteLine("Enter a string:");
//         string ? input = Console.ReadLine();
//         if (!string.IsNullOrEmpty(input) && input.Length > 1)
//         {
//             char firstChar = input[0];
//             char lastChar = input[input.Length - 1];
//             // Create a new string with first and last characters interchanged
//         string result = lastChar + input.Substring(1, input.Length - 2) + firstChar;
//             Console.WriteLine("\nOriginal string: " + input);
//             Console.WriteLine("New string with first and last characters interchanged: " + result);
//         }
//         else
//         {
//             Console.WriteLine("Please enter a vallid string with at least two characters.");
//         }
//     }
// }


// using System;
// namespace ConsoleApp
// {
//     class Vehicle
//     {
//         public string Brand { get; set; }
//         public string Model { get; set; }
//         public int Year { get; set; }
//         public Vehicle(string brand, string model, int year)
//         {
//             Brand = brand;
//             Model = model;
//             Year = year;
//         }
//         public void DisplayDetails()
//         {
//             Console.WriteLine($"Brand: {Brand}");
//             Console.WriteLine($"Model: {Model}");
//             Console.WriteLine($"Year: {Year}");
//         }
//     }
//     class Program
//     {
//         static void Main(string[] args)
//         {
//             Console.WriteLine("First Vehicle Object Details:");
//             Vehicle car = new Vehicle("Toyota", "Corolla", 2018);
//             car.DisplayDetails();
//             Console.WriteLine("\nSecond Vehicle Object Details:");
//             Vehicle bike = new Vehicle("Honda", "CBR", 2019);
//             bike.DisplayDetails();
//         }
//     }
// }

// using System;
// namespace ConsoleApp
// {
//     internal class Library
//     {
//         private string[] books = new string[5];

//         public string this[int index]
//         {
//             get { return books[index]; }
//             set { books[index] = value; }
//         }

//         public int TotalBooks
//         {
//             get { return books.Length; }
//         }

//         public string LibraryName { get; set; }

//         static void Main(string[] args)
//         {
//             Library library = new Library { LibraryName = "City Library" };
//             library[0] = "1984 by George Orwell";
//             library[1] = "To Kill a Mockingbird by Harper Lee";
//             library[2] = "The Great Gatsby by F. Scott Fitzgerald";
//             library[3] = "Art of War by Sun Tzu";
//             library[4] = "War and Peace by Leo Tolstoy";

//             Console.WriteLine($"{library.LibraryName} Books:");
//             for (int i = 0; i < library.TotalBooks; i++)
//             {
//                 Console.WriteLine($"Book {i + 1}: {library[i]}");
//             }
//         }
//     }
// }

// using System;
// // Base class
// class Animal
// {
//     public Animal()
//     {
//         Console.WriteLine("Animal default constructor called.");
//     }
//     public Animal(string name)
//     {
//         Console.WriteLine("Animal constructor with parameter called. Name: " + name);
//     }
//     public virtual void Speak()
//     {
//         Console.WriteLine("Animal speaks.");
//     }
// }

// // Derived class
// class Dog : Animal
// {
//     public Dog() : base()
//     {
//         Console.WriteLine("Dog default constructor called.");
//     }
//     public Dog(string name) : base(name)
//     {
//         Console.WriteLine("Dog constructor with parameter called. Name: " + name);
//     }
//     public override void Speak()
//     {
//         Console.WriteLine("Dog barks.");
//     }
// }

// class Program
// {
//     static void Main(string[] args)
//     {
//         // Constructor Overloading
//         Console.WriteLine("Constructor Overloading:");
//         Animal animal1 = new Animal();
//         Animal animal2 = new Animal("Lion");
//         Dog dog1 = new Dog();
//         Dog dog2 = new Dog("Buddy");

//         // Method Overriding
//         Console.WriteLine("\nMethod Overriding:");
//         Animal animalRef = new Animal();
//         animalRef.Speak();
//         Animal dogRef = new Dog();
//         dogRef.Speak();
//     }
// }

// using System;

// // Define the first interface
// public interface IVehicle
// {
//     void Drive();
// }

// // Define the second interface
// public interface IFlyable
// {
//     void Fly();
// }

// // Implement the interfaces in a class
// public class Car : IVehicle, IFlyable
// {
//     public void Drive()
//     {
//         Console.WriteLine("Car is driving.");
//     }

//     public void Fly()
//     {
//         Console.WriteLine("Car is flying.");
//     }
// }

// class Program
// {
//     static void Main()
//     {
//         // Create an instance of Car
//         Car car = new Car();
//         // Call methods from interfaces
//         car.Drive();
//         car.Fly();
//     }
// }

// using System;
// class Program
// {
//     static void Main()
//     {
//         try
//         {
//             // Example: ArgumentNullException
//             string str = null;
//             PrintString(str); // This line will throw an exception
//         }
//         catch (ArgumentNullException ex)
//         {
//             Console.WriteLine($"Error: {ex.Message}");
//             // Handle the exception (e.g., provide a default value)
//             Console.WriteLine("String default value: Empty string");
//         }
//         catch (Exception ex)
//         {
//             // Catch-all block for any other exceptions
//             Console.WriteLine($"Error occurred: {ex.Message}");
//         }
//         finally
//         {
//             // Optional finally block, executes whether an exception occurred or not
//             Console.WriteLine("Program execution completed.");
//         }
//         Console.WriteLine("Rest of the program continues...");
//     }

//     static void PrintString(string str)
//     {
//         if (str == null)
//         {
//             throw new ArgumentNullException(nameof(str), "String cannot be null.");
//         }
//         Console.WriteLine(str);
//     }
// }

// using System;

// internal class DelegateExample
// {
//     // Step 1: Define a delegate
//     public delegate void EventHandler(string message);

//     // Step 2: Define a class that contains an event
//     class Publisher
//     {
//         // Step 3: Define an event based on the delegate
//         public event EventHandler Notify;

//         // Step 4: Method to raise the event
//         public void DoSomething()
//         {
//             Console.WriteLine("Doing something...");
//             OnNotify("Something was done.");
//         }

//         // Step 5: Method to invoke the event
//         protected virtual void OnNotify(string message)
//         {
//             Notify?.Invoke(message); // Invoke the event
//         }
//     }

//     // Step 6: Define a class that subscribes to the event
//     class Subscriber
//     {
//         // Step 7: Method to subscribe to the event
//         public void Subscribe(Publisher publisher)
//         {
//             publisher.Notify += HandleEvent;
//         }

//         // Step 8: Method to unsubscribe from the event
//         public void Unsubscribe(Publisher publisher)
//         {
//             publisher.Notify -= HandleEvent;
//         }

//         // Step 9: Event handler method
//         private void HandleEvent(string message)
//         {
//             Console.WriteLine($"Event handled: {message}");
//         }
//     }

//     // Step 10: Main program execution
//     class Program
//     {
//         static void Main(string[] args)
//         {
//             Publisher publisher = new Publisher();
//             Subscriber subscriber = new Subscriber();

//             // Subscribe to the event
//             subscriber.Subscribe(publisher);

//             // Trigger the event
//             publisher.DoSomething();

//             // Unsubscribe from the event
//             subscriber.Unsubscribe(publisher);

//             // Try to trigger the event again
//             publisher.DoSomething();
//         }
//     }
// }


// using System;
// // Generic class
// public class GenericList<T>
// {
//     private T[] _items;
//     private int _currentIndex;
//     // Constructor
//     public GenericList(int capacity)
//     {
//         _items = new T[capacity];
//         _currentIndex = 0;
//     }
//     // Method to add an item to the list
//     public void Add(T item)
//     {
//         if (_currentIndex < _items.Length)
//         {
//             _items[_currentIndex] = item;
//             _currentIndex++;
//         }
//         else
//         {
//             Console.WriteLine("List's full. No more items can be added.");
//         }
//     }
//     // Method to display all items in the list
//     public void DisplayItems()
//     {
//         Console.WriteLine("Listed Items are:");
//         foreach (var item in _items)
//         {
//             Console.WriteLine(item);
//         }
//     }
// }
// class Program
// {
//     static void Main()
//     {
//         // Creating a list of integers
//         GenericList<int> intList = new GenericList<int>(5);
//         intList.Add(10);
//         intList.Add(11);
//         intList.Add(12);
//         intList.DisplayItems();
//         // Creating a list of strings
//         GenericList<string> stringList = new GenericList<string>(3);
//         stringList.Add("China");
//         stringList.Add("India");
//         stringList.DisplayItems();
//     }
// }


// using System;
// using System.Collections.Generic;
// using System.Linq;
// class Program
// {
//     static void Main()
//     {
//         // Sample list of integers
//         List<int> numbers = new List<int> {9,8,7,6,5,4,3,2,1};
//         // Using LINQ to filter odd numbers
//         IEnumerable<int> oddNumbers = numbers.Where(IsOdd);
//         // Display the filtered numbers
//         Console.WriteLine("The odd numbers are:");
//         foreach (var number in oddNumbers)
//         {
//             Console.WriteLine(number);
//         }
//     }
//     // Method to check if a number is odd
//     static bool IsOdd(int number)
//     {
//         return number % 2 != 0;
//     }
// }

// using System;
// using System.Threading.Tasks;

// class Program
// {
//     static async Task Main()
//     {
//         Console.WriteLine("Starting asynchronous operation..........");
//         try
//         {
//             // Call an asynchronous method and await the result
//             string result = await SimulateAsyncOperation();
//             // Display the result
//             Console.WriteLine($"Async operation completed: {result}");
//         }
//         catch (Exception ex)
//         {
//             Console.WriteLine($"Error occurred: {ex.Message}");
//         }

//         // Call a synchronous method
//         SimulateSyncOperation();
//     }

//     // Asynchronous method to simulate work
//     static async Task<string> SimulateAsyncOperation()
//     {
//         await Task.Delay(2000); // Simulate a delay of 2 seconds (2000 milliseconds)
//         return "Operation successfully completed";
//     }

//     // Synchronous method to simulate work
//     static void SimulateSyncOperation()
//     {
//         for (int i = 0; i < 5; i++)
//         {
//             Console.WriteLine("Executing synchronous operation");
//             // Simulate some work
//             Task.Delay(500).Wait(); // Simulate a delay of 0.5 seconds (500 milliseconds)
//         }
//     }
// }
