# IS2545-DELIVERABLE 2:Unit Testing
![build status](https://travis-ci.org/NamkiuZhang/CitySim9002.svg?branch=master)

When  I wrote the code, I just did coding as before . When I began to write unit test, I found it was not easy based on the code I wrote. I thought that not all codes are suitable for unit test.In real develop environment , I  don't think we need to do development based on the rules of testing all the time.

The basic idea is that  I used 4 numbers to present 4 types of visitors, and use  4 numbers to represent 4 locations, and use number 5 to  represent  leave.

The first proble I met is that  I can not run my coding in  terminal. So  I  set a  fixed  number to seed to run  my  project  in netbeans. And I  found that  they all generated  same visitor and locations. Then I changed the location Random ra=new  random(int arg), then it worked though I still a little confused.
Another problem  is that when I  tested the method geneVisitor(int number) in Visitor class( the  method is based on the number inputed to generate a corresponding type  class instance.),  I am not sure whether I  can use  other method  I  write to  verify  the  type of the  class instance is write. Or I can use it after I  comfirm  it  is right. I also  comments this problem in  VisitorTest.java class.







