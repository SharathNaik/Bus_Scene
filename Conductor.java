class Conductor
{
String source,dest;
int srin,dstin;//index of source and destination
String[] myarr={"Majestic","MekriCircle","GeddilaHalli","SanjayNagar","NagashettyHalli","BoopaSandra"};
Ticket tic;
Conductor(String src,String dst){
source=src;
dest=dst;
}
Ticket giveTicket(){
for(int i=0;i<myarr.length;i++){
if(source.equals(myarr[i])){
srin=i;
break;
}
}

for(int i=0;i<myarr.length;i++){
if(dest.equals(myarr[i])){
dstin=i;
break;
}
}
//System.out.println(srin);
//System.out.println(dstin);

tic=new Ticket();
tic.calcFare(srin,dstin);
return tic;
}
}