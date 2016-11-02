#Contents
##Paper
- FSE 2015
- What Change History Tells Us about Thread Synchronization
- Related Concepts: Concurrency Analysis, Over-Synchronization, Lack-of-Synchronization(Concurrency Bugs), Repository Mining

##Research Type & Input & Output
- Key words: Locks, Empirical Study, Repository Mining, Concurrency Bugs, Performance Bugs, Multi-Threaded Software
- => Empirical Study on Concurrency issues
- Input: Repository information(Version Control Tool), Bug Report
- Output: Relationship of Concurrency Bugs, Performance Bugs and Code Revisions(Statistical & Empirical)
- Main Approach: Regular expression tools to Analyze the Critical Section Related Codes, Manually Read Bug Reports
- Feature: no specific algorithm here

##Background
- Physical, Multicore -> Logical, Multi-Threading -> Concurrency
  - Race Conditions(access of shared memory, e.g, variable) -> Critical Section (SpinLock, MutexLock)
  - Other Synchronization(iteration-Based, e.g, barrier implemented with condition variable)

##Motivation
- Bug report is not able to cover all things
- Bug information is scattered throught the multiple versions of code repositories
- Bug information is hidden in the long repositories' commit log, issues, some pull-requests
- Too many lines of codes to analyze -> make use of revision history, incremental trend

##Contributions
- Empirical General Study, Repository Mining
- Observations
  - frequent modifications of critical sections
  - changes of critical sections become stable with aging
  - fixing correctness bugs are more frequent than fixing over-synchronization to improve performance
- Case Study of Mozilla, Apache HttpServer, Mysql, MPlayer, over-synchronization & concurrency-bug
  - significance of incremental revision analysis, 50% bugs introduced under old context & 50% bugs introduced with new introduced shared variables

##Methodology
- Things relevant are critical sections
- Structural Pattern
  - e.g, add(body, synchronization statements), remove(body, synchronization statements), modify(body, synchronization statements)
  - modify, shared variable, primitives(condition variable - signal/wait, mutex - lock/unlock), split, boundary(make the scope tight)
- Purpose
  - correctness, functionality, maintianability, performance, robustness
- Main Approach: Regular expression tools to Analyze the Critical Section Related Codes, Manually Read Bug Reports
  - No AST, No control-flow, No pointer-alias => lock(p1) unlock(p2), lock in this, unlock in another invoked function
  - simply keyword serach lock, latch, mutex, special case dealing with: C++ RAII
  - not sound, false negatives, argue not much 5%, mannuly

##Discussion: Critical Section Changes  
- Observations(Structural Pattern Oriented)
  - How many changes happen: frequent modifications of critical sections
  - When did changes happen: changes of critical sections become stable with aging
  - Why did changes happen: fixing correctness bugs(31%) are more frequent than fixing over-synchronization(8.5%) to improve performance,
extracted from the structural pattern and sampled cases manually checking
- history is useful

##Over-Synchronization
- Observation
- ModSync Split
  - Split Scopes of Critical Section Body
- ModSync Variable
  - Introduce New Variables
- ModSync Boundary(Scope)
  - Shrink Scopes
- Feasible to Develop tools to automate part of over-synchronization detection and fix it
- history is useful

##Concurrency-Bugs
- focus on shared variables, instructions access them, synchronization-context, i.e, locked body and preceding barriers
- mannuly this part, bug reports(quite rare), part of sampled revision logs
- Observations
  - with old synchronization context information, 50% of studies bugs would require no new synchronization analysis to be detected
  - memory-access analysis be simplied, 50% for new bugs, only analyze the changed codes

- history is useful, not much work on it

##Q & A
