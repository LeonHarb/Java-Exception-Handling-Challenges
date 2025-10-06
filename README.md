# Java Exception Handling Challenges  

## Description  
This project explores advanced exception handling in Java through multiple practical programs. Each challenge demonstrates how to use custom and built-in exceptions to handle invalid inputs, file operations, and logical constraints in real-world scenarios.  

---

## 📘 Challenges Overview  

### **Challenge 1: FileProcessor.java**  
Reads a text file and counts the number of lines and words using `BufferedReader` and `FileReader`.  
Handles exceptions like:  
- `FileNotFoundException` (file not found)  
- `IOException` (general read errors)  
- Custom `EmptyFileException` (for empty files)  

---

### **Challenge 2: PasswordValidator.java**  
Validates user passwords based on these rules:  
- Minimum 8 characters  
- At least one digit and one uppercase letter  
If validation fails, throws a custom `InvalidPasswordException`.  

---

### **Challenge 3: TemperatureConverter.java**  
Converts Celsius to Fahrenheit with exception handling for invalid or extreme inputs:  
- Throws `InvalidTemperatureException` if below absolute zero (-273.15°C)  
- Handles `NumberFormatException` for non-numeric inputs  

---

### **Challenge 4: StudentRegistration.java**  
Simulates a course registration system that validates course codes.  
- Allowed codes: `CS101`, `MATH201`, `BIO301`  
- Throws `CourseNotFoundException` for invalid course codes  
- Uses the `Student` class to register courses interactively  

---

## 🧰 Technologies Used  
- **Language:** Java (JDK 17+)  
- **IDE:** Eclipse / IntelliJ IDEA / VS Code  
- **Concepts Practiced:**  
  - Exception handling (`try`, `catch`, `throw`, `throws`)  
  - Custom checked and unchecked exceptions  
  - File I/O with `BufferedReader` and `FileReader`  
  - Input validation and user interaction  

---

## 🧩 Concepts Practiced  
- **Custom Exception Design** – Creating and extending `Exception` and `RuntimeException` classes.  
- **Checked vs. Unchecked Exceptions** – Handling recoverable vs. unrecoverable errors.  
- **File Input/Output Operations** – Managing file reading safely with error detection.  
- **Data Validation** – Enforcing logical and input constraints using exceptions.  

---

## ▶️ How to Run  

### **Option 1: Using an IDE (Eclipse or IntelliJ)**  
1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/java-exception-challenges.git
   ```  
2. Open the project in your IDE.  
3. Navigate to the `src` folder.  
4. Run each Java file individually (e.g., `FileProcessor.java`, `PasswordValidator.java`, etc.).  

### **Option 2: Using Terminal/Command Prompt**  
1. Navigate to the `src` directory:  
   ```bash
   cd src
   ```  
2. Compile the files:  
   ```bash
   javac *.java
   ```  
3. Run the desired program:  
   ```bash
   java FileProcessor
   ```  
   or  
   ```bash
   java PasswordValidator
   ```  

---

## 🧠 Example Outputs  

**FileProcessor.java**  
```
Enter the file name: notes.txt
Total lines: 15
Total words: 234
```

**PasswordValidator.java**  
```
Enter your password: welcome
InvalidPasswordException: Password must be at least 8 characters, contain one digit and one uppercase letter.
Enter your password: Hello123
Password accepted.
```

**TemperatureConverter.java**  
```
Enter Celsius temperature: -500
InvalidTemperatureException: Temperature cannot be below absolute zero.
Enter Celsius temperature: 25
Fahrenheit: 77.0°F
```

**StudentRegistration.java**  
```
Enter course code to register: CS105
CourseNotFoundException: CS105 is not a valid course.
Enter course code to register: CS101
Successfully registered for CS101.
```

---

✅ **Author:** Leon Sharbel Harb  
📅 **Course:** Java OOP – Exception Handling Labs  
🏫 **Institution:** St. Mary’s University  
