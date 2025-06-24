#!/bin/bash

echo "=== Java Calculator Build Script ==="

# Create output directory
mkdir -p build/classes

# Compile the Java source code
echo "Compiling Java source..."
javac -d build/classes src/main/java/com/example/Calculator.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Running Calculator..."
    echo "========================"
    java -cp build/classes com.example.Calculator
else
    echo "Compilation failed!"
    exit 1
fi