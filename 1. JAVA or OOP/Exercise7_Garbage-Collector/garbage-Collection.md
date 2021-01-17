# Garbage Collection
Daemon which manage memory. may affect performance.\
`System.gc(); // will try calling gc may not run gc decide`

## Static Fields
Garbage collector doesn't touch Static members. they live for the inter memory

## Steps
1. Marking - determine which pieces of memory are in use and which are not.
2. Normal Deletion - delete.
3. Compacting - defrag the memory.

## Imp Approaches to GC
### Reference Counter
```c
void * p = obj1; //obj1->ref_count++
void * p = obj2; //obj1->ref_count--, obj2->count++
```
Same count-- at end of scopes.\
If object's ref_count == 0, it is garbage.

#### Has issues with cyclic List
you may lose the ref for cyclic link list all count count = 1 even no ref in the program.

### Mark And Sweep
scan all object and check if they reachable.(Using sign bit)
* start at the roots 
* mark the bit if he reach
* swipe all not marked

#### Pros and Cons
The good:
1. no issue wit cyclic list.
The bad:
1. long CPU time

### Garbage Collection in java
generational collector

GC periodically runs two different collections:
1. Minor collection - occurs frequently\
   Occurs whenever Eden gets full
2. Major collection - occurs infrequently

Divide heap into 4 regions:
* Eden: newly allocated objects
* Survivor 1: survive from Eden survived her pass to survivor 2
* Survivor 2: survive from Eden
* Tenured: Survive several minor collections\
  Only scan when major collection.