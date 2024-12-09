# CS4450_Interpreter
CS4450 Python Interpreter Final Project

Python interpreter using Java and ANTLR.

### Group Members
- Bach Nguyen
- Luke Deffenbaugh
- Daniel Hernandez
- Tj Main

### Requirements

1. IntelliJ
2. ANTLR tool jar
3. Java SE Development Kit
4. This repository
5. ANTLR Plug-IN

**Set-Up**
1. Open a this as a Java/JDK project in IntelliJ
2. If you don't have the ANTLR v4 Plugin, look it up at IntelliJ Preferences/Settings > Plugins
3. Now click on these folders: Parser > src > main.antlr to find the .g4 files
4. Right click on PythonParser.g4 file and select "Generate ANTLR Recognizer"
5. Use the preview on the ANTLR v4 Plugin to see parse tree and test codes

**Running Tests**
1. Can just put test python files in the src and view through the ANTLR4 plug-in preview
2. If you change the Python code save the file and repeat the previous steps.
3. Alternatively there is an Input setting to type anything you want.
4. NOTE: The Main.java file does not work, and will run the tests based off an outdated compilation from Deliverable #1, leading to multiple false errors.

Demo
[![YouTube Video](https://img.youtube.com/vi/dTt4JQfrx-k/0.jpg)](https://youtu.be/dTt4JQfrx-k)
