#### Counting out problem


##### To run the program

```
sbt "run <n> <k>"
``` 

- n is the number of people on the table

- k is the step rate,
  
  (a -ve k indicates counting in anti-clockwise direction)
  
  "0" is an invalid input for k
  
   k=1, means everyone is eliminating themselves. 


Example sbt "run 3 2"

output:
```
the position you need to stand at is : 3
```


##### To run the tests

```
sbt test
```
