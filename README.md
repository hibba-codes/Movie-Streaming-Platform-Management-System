# Movie Streaming Platform Management System

A Java Object-Oriented Programming (OOP) project that simulates a dynamic Movie Streaming Platform. The system effectively manages different types of media content (Movies and Series), tracks financial performance, and identifies top-performing assets using clean code practices.

---

## Features

*   **Content Management:** Seamlessly handle and organize a diverse catalog of movies and series.
*   **Smart Revenue Calculation:** Distinct financial logic for different media types—movies calculate revenue based on ticket sales, while series use subscription-based metrics.
*   **Platform Analytics:** Automatically computes the total collective revenue generated across the entire platform.
*   **Performance Tracking:** Instantly filters and identifies the highest-earning content on the platform.
*   **Conditional Logic:** Implements robust rules to evaluate data and drive system decisions.

---

## OOP Concepts Applied

This project focuses heavily on implementing clean, reusable, and structured code using core Java Object-Oriented Programming principles:

*   **Abstraction:** Utilizing abstract structures to define content templates without exposing unnecessary background logic.
*   **Inheritance:** Passing down shared traits from a central parent class to specialized content types.
*   **Polymorphism & Method Overriding:** Dynamic runtime execution allowing different content types to process their unique revenue formulas seamlessly.
*   **Encapsulation:** Safeguarding data integrity by keeping class attributes private and accessible only through controlled methods.

---

## Class Architecture

### 1. Content (Abstract Class)
The foundational blueprint of the system. It stores common properties shared by all media assets, ensuring a unified structure.

### 2. Movie (Subclass)
Represents feature films. It extends the `Content` class and calculates revenue using the formula:
$$\text{Revenue} = \text{Tickets Sold} \times \text{Ticket Price}$$

### 3. Series (Subclass)
Represents multi-episode shows. It extends the `Content` class and evaluates financial performance based on user subscriptions and premium streaming metrics.

---

## Technologies Used

*   **Language:** Java
*   **Paradigm:** Object-Oriented Programming (OOP)

---

## Sample Output

When you run the application, the console will display:
1. Detailed overviews of all registered Movies and Series.
2. Individual revenue breakdowns for each title.
3. A highlighted spotlight on the top-earning content.
4. The final aggregated revenue for the entire platform.

---

## ✍️ Author

*   **Hibba Iqbal** - [GitHub Profile](https://github.com/your-username)
