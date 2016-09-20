#Randoop Generated Files Bug
> 这是因为，虽然Object是Date、String、Integer、Double的父类，但是 List<Object>
不是 List<Date>、List<String>、List<Integer>、List<Double> 的父类，因而不能把 List<Date> 等类型的对象赋给 List<Object> 类型的变量。

- There is bug because of the above reason