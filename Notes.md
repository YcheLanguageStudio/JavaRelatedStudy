#Class Notes
##Faults & Errors & Failures
- fault: static defect
- error: incorrect internal state   
```java
public static int numZero(int[]x)
{
  int count=0;
  for(int i=1; i<x.length; i++){
    if(x[i]==count){
      count++;
    }
  }
  return count;
}
```    
- failure: external incorrect behavior

##Test & Debug
- Test: find inputs that cause the software to failure
- Debug: find a fault given a failure
