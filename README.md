# quotes
CodeFellows Java 401 - Lab 8: Quotes & Lab 9: Potent Quotables

### [App](src/main/java/quotes/App.java) | [Tests](src/test/java/quotes/AppTest.java)


## Feature Tasks
* #### Lab 08: Quotes
  * Use the file recentquotes.json to show random popular book quotes. Your program should use GSON to parse the .json file. The app needs no functionality other than showing the quote and the author when it is run. The app should choose one quote each time it is run.
* #### Lab 09: Potent Quotables
  * Refactor code from lab 8
  * Get a quote from an API
    * [Ron Swanson Quotes](https://github.com/jamesseanwright/ron-swanson-quotes#ron-swanson-quotes-api)
  * If you have an error connecting to the API, pull a random quote from a local json cache file instead
  * Add quotes that come back from the API to the local cache file

## How to Run:
1. open terminal
2. navigate to cloned directory
3. type `./gradlew run`

## How to Test:
1. open terminal
2. navigate to cloned directory
3. type `./gradlew test`