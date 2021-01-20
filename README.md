# CSCI 4237 - Homework 2 - Kotlin Exercise
**!!Before you commit any code to this repo, make sure you have created a new branch so that you can submit a Pull Request!!** See the **Submission** section for more details.

## Purpose
Practice using the Kotlin programming language and get comfortable reading language documentation & code examples, which will also come in handy as we move into learning Android.

The data used in this assignment (Metro station names and Metro station codes (IDs))
comes from the [WMATA API](https://developer.wmata.com/) and many of their APIs actually use the unique station codes to refer to specific stations, rather than the stations' names that we are
more familiar with. e.g. the problem you are asked to solve is somewhat realistic :)

Reference: [WMATA System Map](https://www.wmata.com/schedules/maps/upload/metrorail-system-map-effective-august-17.pdf)

## Prerequisites
You will need _something_ you can use to compile and execute Kotlin code. Android Studio does **not** allow you to build standalone Kotlin projects (e.g. non-apps).

Options are:
- [Download IntelliJ Community](https://www.jetbrains.com/idea/download/)
  - [Getting Started Guide](https://kotlinlang.org/docs/tutorials/jvm-get-started.html)
  - Create a new Kotlin project and copy-paste the `homework2.kt` contents in if you cannot directly import the file.
- I'm not familiar with VSCode, but some students have used [this Kotlin plugin](https://marketplace.visualstudio.com/items?itemName=fwcd.kotlin) in the past.
  - You _may_ need to install the [Kotlin Command Line tools](https://kotlinlang.org/docs/tutorials/command-line.html).
- [The Online Kotlin Playground](https://play.kotlinlang.org/)
  - This uses your _browser cookies_ to "save" your program. **Do not** clear browser data without saving your program to a hard file first.
  - Sometimes the Kotlin Online Playground may not execute your code and tries to "process" for 10 seconds before stopping. If this happens, try refreshing the page.
  - Make sure you save your progress frequently to the `homework2.kt` file, as backup.

If you are not able to directly import `homework2.kt` into your IDE, you can instead create a new Kotlin project and paste the code in (and later copy-paste the solution back into the original file for submission). For the Online Playground, just copy-paste the Kotlin contents in.

Use `git` to clone this repository to your local machine. You'll need to push your final code
back up to this repo in a **new branch** and make a Pull Request (see the Submission section).

## Reading Material
This assignment will require you to review the [Kotlin language documentation](https://kotlinlang.org/docs/reference/) and self-teach some of the language's features and syntax. I will be using Kotlin all semester and will be explaining new topics as they arise, but the best way to learn a new language is to use it naturally (and don't be afraid to ask questions on Slack!).

Here's a few links to some relevant documentation:
- [Kotlin Docs - Main Reference](https://kotlinlang.org/docs/reference/)
- [Kotlin Docs - Basic Syntax](https://kotlinlang.org/docs/reference/basic-syntax.html)
- [Kotlin Docs - Basic Types](https://kotlinlang.org/docs/reference/basic-types.html)
- [Kotlin Docs - Control Flow](https://kotlinlang.org/docs/reference/control-flow.html)
- [Kotlin Docs - Collections (Lists)](https://kotlinlang.org/docs/reference/collections-overview.html)
- [Kotlin Docs - Functions](https://kotlinlang.org/docs/reference/functions.html)

We will also make use of Kotlin's higher-order functions / lambda expressions naturally thru Android development. If you haven't used these features before in Java, take some time to review:
- [My extra slides on Kotlin Lambdas](https://docs.google.com/presentation/d/1hDnryyUH7aKIM7QsImi485a6Q0wwBwwfuiiIDM8A7ok/)
- [Java's Lambda Expressions](https://www.w3schools.com/java/java_lambda.asp#:~:text=Lambda%20Expressions%20were%20added%20in,the%20body%20of%20a%20method.)
- [Kotlin Docs - Lambdas](https://kotlinlang.org/docs/reference/lambdas.html)
- [Kotlin Docs - Shortcuts for Searching Lists using Lambdas](https://kotlinlang.org/docs/reference/collection-elements.html#retrieving-by-condition)
- [Kotlin Docs - List Iterations (see: forEach)](https://kotlinlang.org/docs/reference/iterators.html)

## Requirements
See the **Grade Breakdown** section at the end for how these requirements affect your grade.

### Primary Requirements
Fill out the contents of the `pathFromFoggyBottom` function:
- The function takes one parameter `destinationCode`.
- The function should determine if there is a Metro path between **Foggy Bottom (C04)** and the station with `destinationCode`.
- If a path exists, the function must print:
  - The **station name** of the destination.
  - The **Metro line** (e.g. _Silver_, _Orange_, or _Blue_)
  - The **list of stations**, _in order_, on the path from Foggy Bottom to the destination (inclusive).
  - The **direction** of the train on the line, which is denoted by the final station of the line. For example, from Foggy Bottom, a given Silver line train goes in the direction either towards _Wiehle-Reston East_ or _Largo Town Center_ (ignoring station closures, peak hours, etc.)
- If _multiple_ path exists, you can choose any single path to output.

### Secondary Requirements
- You must support the scenario where the destination station / path _doesn't exist_ (print some kind of error message).
- You must support the scenario where the destination station _is_ Foggy Bottom (e.g. no need to take the Metro).

### Code Requirements
- You must use at least **one** of the following [Kotlin's collection operations](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html#functions) which accepts a [lambda](https://www.geeksforgeeks.org/kotlin-lambdas-expressions-and-anonymous-functions/). Some examples which would be useful:
  - [forEach](https://kotlinlang.org/docs/reference/iterators.html#iterators)
  - [forEachIndexed](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each-indexed.html)
  - [find](https://kotlinlang.org/docs/reference/collection-elements.html)
  - The idea here is that you will naturally need to use _one_ of these in your solution anyway. You could choose to manually write out a full for-loop instead, but understanding lambdas will come in handy for Android development.
    - Refer to the **Reading Material** section above for helpful links.
- You must define and call **one** helper [function](https://kotlinlang.org/docs/reference/functions.html) (can do whatever you want).
- You must use Kotlin's [String Templates](https://kotlinlang.org/docs/reference/basic-syntax.html#using-string-templates) instead of String concatenation. For example, when printing output to console.

### Restrictions
- You may **not** modify the initial set of line `List`s or the `Station` class. You may add _additional_ data structures / variables, if needed.
- You may **not** add additional _parameters_ to the `pathFromFoggyBottom` function.

## Example
Here's an example output for destination code `C01` (Metro Center):
```
Destination:
Metro Center

Line:
Silver

Towards:
Largo Town Center

Path:
Foggy Bottom-GWU
Farragut West
McPherson Square
Metro Center
```
## Submission
1. Paste your final code submission back into `homework2.kt`.
2. Commit and push the change into a **new branch** on GitHub.
3. Submit a **Pull Request** for me to review during grading (you may merge the PR without waiting for my review).

I will paste your `homework2.kt` into the Online Playground or IDE to test during grading.

Your grade will include whether a proper Pull Request was submitted and whether the code executes as expected.

**!!Finally, make sure you submit the URL to your Pull Request on Blackboard!!**

## Grade Breakdown
- 60% Primary Requirements Met
  - 10% Destination Station Name
  - 10% Line Name
  - 10% Train Direction
  - 30% Correct Path Printed
    - I'll be testing stations on each of the lines uniquely (Silver, Orange, Blue)
- 10% Secondary Requirements Met
  - 5% Destination Station / Path Doesn't Exist
  - 5% Destination is Foggy Bottom
- 15% Code Requirements
  - 5% Collection Function with Lambda
  - 5% Helper Function Usage
  - 5% String Templates
- 15% Pull Request Submission
  - 5% Pull Request Made
  - 10% Pull Request contains Full Set of Code Changes (e.g. PR is made correctly)
