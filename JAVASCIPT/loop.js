const nums=[1,2,3,4,5,6,7,8,9,10];
for(let n=0;n<=10;n++){
    if(n%2==0){
        console.log(n);
    }
}
let n=0;
while(n<=10){
    if(nums[n]%2==0){
        console.log(nums[n]);
    }
    n++;
}

do{
    if(nums[n]%2==0){
        console.log(nums[n])
    }
}while(n<=10)