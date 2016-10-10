#Assignment 1
##Questions & Answers
###Q1: Randoop Related
- Q1-(1): **What is test oracle when conducting random testing via Randoop**

- Answer: five built-in **test oracle** are as follows:
  1. Equals to null: `o.equals(null)` should return `false`
  1. Reflexivity of equality: `o.equals(o)` should return `true`
  1. Symmetry of equality: `o1.equals(o2)` implies `o2.equals(o1)`
  1. Equals-hashcode: If `o1.equals(o2)==true`, then `o1.hashCode()==o2.hashCode()`
  1. No null pointer exceptions: NO `NullPointerException` is thrown if no null inputs are used in a test

---

- Q1-(2): **How do you use Randoop to generate test cases? (Please give a detailed descriptions on the steps and the parameter settings.)**

---

###Q2: Coverage Related
- Q2-(1): **Please specify the settings of Randoop**

---

- Q2-(2): **What are the statement coverage and branch coverage in your random testing**

---

##Instruction & Coverage Measurement Program
###Part1:Statement Coverage

---

###Part2:Branch Coverage(Bonus)

---

##References
- [Tutorial](../../../SoftwareAnalysis/References/workshop1/Tutorial_1.pdf)
- [Assignment Requirements](https://course.cse.ust.hk/comp5111/assignment/assignment1.html)
- [Assignment Faq](http://sccpu2.cse.ust.hk/wurongxin/faq.html)
- [Soot Doc](https://course.cse.ust.hk/comp5111/assignment/soot_tutorials/index.html)
