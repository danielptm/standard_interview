### About
This is a java code test for interviewing with The Standard.

### Dependencies
1. Java11 is installed and working in your IDE
2. Maven is installed and able to install dependencies and build the code from your IDE
3. Use an IDE of your choice (Intellij, Eclipse, VSC etc.)

### Instructions:
1. Create an API method to consume a payload that contains a string. Use spring for this.
2. Write a function that reverses the string. Do this from scratch without a java library provided function.
3. Write a unit test for this reverse string function.
4. Return the reversed string from the API method.
5. You have fullfilled the functional requirements once we can send a post request with a payload containing the string and receive back the string's characters reversed. For example:

The JSON for the incoming payload should structured like this:
```
{
    payloadString: "abc"
}
```

The JSON for the outgoing payload would like like this:
```
{
    payloadString: "cba"
}
```
