class Person
{
void doWork(){
//Bus 
Bus b=new Bus();
//Conductor
b.con=new Conductor("Majestic","GeddilaHalli");
Ticket tick=b.con.giveTicket();
String[] myArray=b.con.myarr;
int srcin=b.con.srin;
int destin=b.con.dstin;
//System.out.println(srcin);
//System.out.println(destin);

for(int i=0;i<myArray.length;i++){
if(i==srcin && i<myArray.length-1){
System.out.println("---------------------------------");
b.passIn();
b.start();
System.out.println("Current Stop"+"-->"+myArray[i]);
System.out.println("Next Stop"+"-->"+myArray[i+1]);
b.stop();
System.out.println("---------------------------------");
}
else if(i==destin && i<myArray.length-1){
System.out.println("---------------------------------");
b.passOut();
b.start();
System.out.println("Current Stop"+"-->"+myArray[i]);
System.out.println("Next Stop"+"-->"+myArray[i+1]);
b.stop();
System.out.println("---------------------------------");
}
else if(i<myArray.length-1){
System.out.println("---------------------------------");
b.start();
System.out.println("Current Stop"+"-->"+myArray[i]);
System.out.println("Next Stop"+"-->"+myArray[i+1]);
b.stop();
System.out.println("---------------------------------");
}
else{
System.out.println("---------------------------------");
System.out.println("Journey Ends");
System.out.println("---------------------------------");
}
}
System.out.println("Ticket Details:");
System.out.println("source:"+b.con.source);
System.out.println("Destination:"+b.con.dest);
System.out.println("Cost of Ticket:"+tick.val);
}
}