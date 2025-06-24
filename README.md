# Java Calculator

A simple Java boilerplate project that demonstrates basic addition operations.

## Project Structure

```
src/
  main/
    java/
      com/
        example/
          Calculator.java    # Main calculator class with addition methods
build.sh                     # Build and run script
```

## Features

- Add two integers
- Add two double numbers
- Method overloading demonstration
- Comprehensive JavaDoc documentation

## How to Use

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Bash shell (for the build script)

### Compilation and Execution

1. Make the build script executable:
   ```bash
   chmod +x build.sh
   ```

2. Run the build script:
   ```bash
   ./build.sh
   ```

### Manual Compilation

If you prefer to compile manually:

```bash
# Create build directory
mkdir -p build/classes

# Compile
javac -d build/classes src/main/java/com/example/Calculator.java

# Run
java -cp build/classes com.example.Calculator
```

## Example Output

```
Adding integers: 10 + 25 = 35
Adding doubles: 15.5 + 20.3 = 35.8

--- Calculator Demo ---
This calculator can add two numbers!
Feel free to modify the values in the code and recompile.
```

## Extending the Calculator

You can easily extend this calculator by adding more methods to the `Calculator.java` class:
- Subtraction
- Multiplication
- Division
- More advanced mathematical operations