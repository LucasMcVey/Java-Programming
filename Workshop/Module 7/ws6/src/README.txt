The code in this project is essentially the code that was used in
the Week 7 workshop, with some modifications.

The package "objectasparam" is roughly the same as the "oap" package,
with a few extra details. ObjectAsParameterExample
also shows that just as you can't, in a method call, modify the
value of an object reference (p1), you also can't modify the value of a
primitive (bogusValue).

The package "q" is the one that we used in the workshop.
The "quiz" package uses the same idea, but the code structure is a little
more elaborate (which makes the program more flexible). Rather than
adding questions to the Quiz directly, we create a QuestionBank out
of all the questions, and then link the Quiz to the QuestionBank, and
have it select random Questions from the QuestionBank to ask.
This structure is arguably more flexible, as it allows QuestionBanks to be
(potentially) saved somewhere, e.g. on disk or in a database,
and reused in other Quizzes (or for other purposes than Quizzes),
because they are in a separate class, whereas in the "q" package
Quizzes directly managed their Questions.
(For this to make sense, there would have to be a reason why Questions
are grouped together in a single QuestionBank - for example they all
related to the same module in a topic.)


