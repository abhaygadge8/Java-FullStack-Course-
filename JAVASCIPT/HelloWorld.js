class Student{
    studentRoll;
    studentName;
    marks;
}
let s1=new Student();
s1["studentRoll"]=23092001;
s1["studentName"]="Abhay";
s1["marks"]=67;
console.log(s1);
for(let keys in s1){
    console.log(keys +" "+s1[keys]);
    console.log(typeof keys);

}