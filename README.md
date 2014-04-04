fun
===

Gradle + Groovy + searching Maven Central from the command-line = fun!

Here's a teeny-weeny Groovy script to search the Maven Central repository.

Build it like this:

    gradle distZip
    
This will create a zip file as `build/distributions/fun.zip`.  Unzip this wherever you like,
and you'll be left with an executable called `fun` (or `fun.bat`).

Then, you can run the script as:

    fun "spring-framework"
    
And you'll get back a list of matching artifacts.

    org.springframework:spring-framework-bom:4.0.3.RELEASE
    net.anthavio.maven:spring-framework-bom:4.0.2.RELEASE
